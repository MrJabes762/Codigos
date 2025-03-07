package deteccaoDeFalhasEmSistemasDistribuidos;

import deteccaoDeFalhasEmSistemasDistribuidos.model.NoHeartbeat;
import deteccaoDeFalhasEmSistemasDistribuidos.service.MecanismoDeteccaoDeFalhasHeartbeat;

public class main {
    public static void main(String[] args) {

        // Estanciamento do mecanismo 
        MecanismoDeteccaoDeFalhasHeartbeat mecanismo = new MecanismoDeteccaoDeFalhasHeartbeat();
        //Criação de 4 exemplos de No
        NoHeartbeat no1 = new NoHeartbeat("Servidor 1", 1000);
        NoHeartbeat no2 = new NoHeartbeat("Servidor 2", 500);
        NoHeartbeat no3 = new NoHeartbeat("Servidor 3", 100);
        NoHeartbeat no4 = new NoHeartbeat("Servidor 4", 80);

        //Adicionando os nos ao sistema 
        System.out.println(mecanismo.adicionarNoHeartbeat(no1));
        System.out.println(mecanismo.adicionarNoHeartbeat(no2));
        System.out.println(mecanismo.adicionarNoHeartbeat(no3));
        System.out.println(mecanismo.adicionarNoHeartbeat(no4));

        //Evocação do Timer que Simular falha no nó 2 após 5 segundos
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                no2.pararHeartbeat();
            }
        }, 5000);
    }
}
