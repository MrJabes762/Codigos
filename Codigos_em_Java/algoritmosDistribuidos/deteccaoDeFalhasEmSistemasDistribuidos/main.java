package deteccaoDeFalhasEmSistemasDistribuidos;

import deteccaoDeFalhasEmSistemasDistribuidos.model.NoHeartbeat;

public class main {
    public static void main(String[] args) {
        MecanismoDeteccaoDeFalhasHeartbeat mecanismo = new MecanismoDeteccaoDeFalhasHeartbeat();
        NoHeartbeat no1 = new NoHeartbeat("Servidor 1", 1000);
        NoHeartbeat no2 = new NoHeartbeat("Servidor 2", 500);
        NoHeartbeat no3 = new NoHeartbeat("Servidor 3", 100);
        NoHeartbeat no4 = new NoHeartbeat("Servidor 4", 80);

        System.out.println(mecanismo.adicionarNoHeartbeat(no1));
        System.out.println(mecanismo.adicionarNoHeartbeat(no2));
        System.out.println(mecanismo.adicionarNoHeartbeat(no3));
        System.out.println(mecanismo.adicionarNoHeartbeat(no4));

        // Simular falha no nó 2 após 5 segundos
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                no2.pararHeartbeat();
            }
        }, 5000);
    }
}
