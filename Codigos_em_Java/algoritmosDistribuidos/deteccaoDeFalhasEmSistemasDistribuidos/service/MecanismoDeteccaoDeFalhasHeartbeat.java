package deteccaoDeFalhasEmSistemasDistribuidos.service;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.service.SistemaDeAlgoritmoDeEleicao;
import deteccaoDeFalhasEmSistemasDistribuidos.model.NoHeartbeat;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MecanismoDeteccaoDeFalhasHeartbeat extends SistemaDeAlgoritmoDeEleicao {

    private Map<NoHeartbeat, Long> ultimosHeartbeats;
    private Timer timer;

    public MecanismoDeteccaoDeFalhasHeartbeat() {
        this.ultimosHeartbeats = new HashMap<>();
        this.timer = new Timer();
        iniciarMonitoramento();
    }

    public void receberHeartbeat(NoHeartbeat noHeartbeat) {
        ultimosHeartbeats.put(noHeartbeat, System.currentTimeMillis());
    }

    private void iniciarMonitoramento() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long agora = System.currentTimeMillis();
                ultimosHeartbeats.forEach((no, timestamp) -> {
                    if (agora - timestamp > 3000) { // Tempo limite de 3 segundos
                        System.out.println("Falha detectada no nó: " + no.getNome());
                        no.pararHeartbeat();
                        try {
                            eventoOcorre();
                            setCoordenador();
                        } catch (EventoLimiteExecption e) {
                            System.out.println(e.getMessage());
                            setContadorDeEventos(0); // Reiniciar o contador de eventos
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }, 0, 1000); // Verifica a cada 1 segundo
    }

    public String adicionarNoHeartbeat(NoHeartbeat noHeartbeat) {
        ultimosHeartbeats.put(noHeartbeat, System.currentTimeMillis());
        noHeartbeat.enviarHeartbeat(this);
        return "Nó Heartbeat adicionado: " + noHeartbeat.getNome();
    }
}
