package deteccaoDeFalhasEmSistemasDistribuidos.model;

import algoritmosdeEleicaoBully.model.No;
import deteccaoDeFalhasEmSistemasDistribuidos.service.MecanismoDeteccaoDeFalhasHeartbeat;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

//Classe de Representação do NoHeartBeat 
// extends No do Algoritimo de e Eleicão

public class NoHeartbeat extends No {
    
    //Atributos
    private boolean ativo;
    private Timer timer;

    //Cosntrutor
    public NoHeartbeat(String nomeDispositivo, int i) {
        // passando os elementos comuns para o construtor do pai 
        super(nomeDispositivo, i);
        this.ativo = true;// setando o no para ativo 
        this.timer = new Timer();// estaciando o Timer
    }

    //metodo de envio de heartBeat ao monitor
    public void enviarHeartbeat(MecanismoDeteccaoDeFalhasHeartbeat monitor) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (isAtivo()) {// se ativo envia o no heartbeat Autoreferenciado 
                    monitor.receberHeartbeat(NoHeartbeat.this);
                }
            }
        }, 0, 1000); // Envia heartbeat a cada 1 segundo
    }
    //metodo de parar o envio de heartbeat
    public void pararHeartbeat() {
        this.ativo = false;
    }
    //Metodo de retorno do valor ativo
    public boolean isAtivo() {
        return ativo;
    }
}
