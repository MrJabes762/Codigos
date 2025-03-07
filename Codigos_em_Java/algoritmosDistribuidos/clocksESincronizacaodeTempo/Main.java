import model.no.No1;
import service.SistemaDistribuidodeClocksESincronizacaoDetempo;

public class Main {
    public static void main(String[] args) {
        // Estanciando o Sistema
        SistemaDistribuidodeClocksESincronizacaoDetempo sistema = new SistemaDistribuidodeClocksESincronizacaoDetempo();

        //Criação de 3 nos conforme solicitado
        No1 no1 = new No1("Casa");
        No1 no2 = new No1("Trabalho");
        No1 no3 = new No1("Escritório");

        // Exemplos de Cenários de envios recebimentos de mensagem 
        no1.setMensagem(sistema.criarMensagem("Mensagem Exemplo", "Mensagem Conteúdo"));
        no1.enviarMensagem(sistema, no3);
        no3.receberMensagem(sistema, no1.getMensagem());
        
        no2.setMensagem(sistema.criarMensagem("Outra Mensagem", "Outro Conteúdo"));
        no2.enviarMensagem(sistema, no1);
        no1.receberMensagem(sistema, no2.getMensagem());
        
        no3.setMensagem(sistema.criarMensagem("Mais uma Mensagem", "Mais um Conteúdo"));
        no3.enviarMensagem(sistema, no2);
        no2.receberMensagem(sistema, no3.getMensagem());
    }
}
