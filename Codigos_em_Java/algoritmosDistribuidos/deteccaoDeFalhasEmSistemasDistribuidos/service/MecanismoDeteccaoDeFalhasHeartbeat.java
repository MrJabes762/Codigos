package deteccaoDeFalhasEmSistemasDistribuidos.service;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.service.SistemaDeAlgoritmoDeEleicao;
import deteccaoDeFalhasEmSistemasDistribuidos.model.NoHeartbeat;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

//Classe de representação do Mecanismo 
//Extends Sistema de eleiçao de bully para eleicao do coordenador
public class MecanismoDeteccaoDeFalhasHeartbeat extends SistemaDeAlgoritmoDeEleicao {
    //Map par No e TImer de registro de ultimos heatbeats
    private Map<NoHeartbeat, Long> ultimosHeartbeats;
    //Timer que sera evocado no monitoramento 
    private Timer timer;

    //Construtor 
    public MecanismoDeteccaoDeFalhasHeartbeat() {
        setUltimosHeartbeats(new HashMap<>());
        setTimer(new Timer());
        iniciarMonitoramento();//Iniciando o monitoramento ao ser instanciado 
    }

    //Método de Receber Heartbeat 
    public void receberHeartbeat(NoHeartbeat noHeartbeat) {
        getUltimosHeartbeats().put(noHeartbeat, System.currentTimeMillis());
    }

    //Metodo de iniciar monitoramento 
    private void iniciarMonitoramento() {
        //estanciando uma tarefa com um tempo de 1 segundo 
        getTimer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long agora = System.currentTimeMillis();
                getUltimosHeartbeats().forEach((no, timestamp) -> {
                    if (agora - timestamp > 3000) { // Tempo limite de 3 segundos
                        System.out.println("Falha detectada no nó: " + no.getNome());
                        no.pararHeartbeat();//Parar o envio de Heartbeat
                        try {
                            eventoOcorre();//Evocando a ocorrencia de eventos da eleição
                            setCoordenador();//setando coordenador
                        } catch (EventoLimiteExecption e) {//tratamento para isso 
                            System.out.println(e.getMessage());
                            setCoordenador();//setando outro coordenador
                            setContadorDeEventos(0); // Reiniciar o contador de eventos
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }, 0, 1000); // Verifica a cada 1 segundo
    }
    // Metodo de acição de no Heartbeat ao map
    public String adicionarNoHeartbeat(NoHeartbeat noHeartbeat) {
        getUltimosHeartbeats().put(noHeartbeat, System.currentTimeMillis());
        //Enviar o Heatbeat com o Autoreferenciamento 
        noHeartbeat.enviarHeartbeat(this);
        //String de retorno do metodo 
        return "Nó Heartbeat adicionado: " + noHeartbeat.getNome();
    }

    // Metodos de acesso 
    public Map<NoHeartbeat,Long> getUltimosHeartbeats() {
        return this.ultimosHeartbeats;
    }

    public void setUltimosHeartbeats(Map<NoHeartbeat,Long> ultimosHeartbeats) {
        this.ultimosHeartbeats = ultimosHeartbeats;
    }

    public Timer getTimer() {
        return this.timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
