package estadoGlobalECapturadeEstado;

import estadoGlobalECapturadeEstado.model.Processo;

public class Main {
    public static void main(String[] args) {
        // Exemplificação do Cenário
        Processo p1 = new Processo(1);
        Processo p2 = new Processo(2);
        Processo p3 = new Processo(3);

        // Cada Processo Terá uma lista de vizinhos previamente preenchida
        p1.adicionarVizinho(p3);
        p1.adicionarVizinho(p2);
        p2.adicionarVizinho(p3);
        p2.adicionarVizinho(p1);
        p3.adicionarVizinho(p1);
        p3.adicionarVizinho(p2);

        System.out.println("Cenario de Envio de Mensagens");
        // Cenário de Envio de Mensagens
        System.out.println(p1.recebendoMensagem("Mensagem de P1 para P2"));
        System.out.println(p2.recebendoMensagem("Mensagem de P2 para P3"));
        System.out.println(p3.recebendoMensagem("Mensagem de P3 para P1"));

        System.out.println("Parte de Captura de Estado e envio de Marcadores");
        // Parte de Captura de Estado e envio de Marcadores 
        p1.recebeMarcador();

        System.out.println("Printando os estados...");
        // Imprimir Estados 
        System.out.println(p1.printEstado());
        System.out.println(p2.printEstado());
        System.out.println(p3.printEstado());
    }
}
