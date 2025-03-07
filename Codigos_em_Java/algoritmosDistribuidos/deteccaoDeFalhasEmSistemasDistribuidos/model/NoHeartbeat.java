package deteccaoDeFalhasEmSistemasDistribuidos.model;

import algoritmosdeEleicaoBully.model.No;
import deteccaoDeFalhasEmSistemasDistribuidos.MecanismoDeteccaoDeFalhasHeartbeat;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class NoHeartbeat extends No {
    
    private List<String> notificacoes;
    private boolean ativo;
    private Timer timer;

    public NoHeartbeat(String nomeDispositivo, int i) {
        super(nomeDispositivo, i);
        this.ativo = true;
        this.timer = new Timer();
    }

    public void enviarHeartbeat(MecanismoDeteccaoDeFalhasHeartbeat monitor) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (ativo) {
                    monitor.receberHeartbeat(NoHeartbeat.this);
                }
            }
        }, 0, 1000); // Envia heartbeat a cada 1 segundo
    }

    public void pararHeartbeat() {
        this.ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
