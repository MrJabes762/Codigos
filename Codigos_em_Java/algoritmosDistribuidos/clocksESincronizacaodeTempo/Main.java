import model.no.No1;
import service.SistemaDistribuidodeClocksESincronizacaoDetempo;

public class Main {
    public static void main(String[] args) {
        No1 no1 = new No1("Casa");
        No1 no2 = new No1 ("Trabalho");
        No1 no3 = new No1 ("Escritorio");
        SistemaDistribuidodeClocksESincronizacaoDetempo sistema = new SistemaDistribuidodeClocksESincronizacaoDetempo();
        no1.setMessagem(sistema.criarMensagem("Mensagem Exemplo", "Mensagem Conteudo"));
        no1.enviarMensagem(sistema, no3);
        no3.receberMensagem(no1.getMessagem());
        no2.setMessagem(sistema.criarMensagem("Outra Mensagem", "Outro Conteudo"));
        no2.enviarMensagem(sistema, no1);
        no1.receberMensagem(no2.getMessagem());
        no3.setMessagem(sistema.criarMensagem("Mais uma Mensagem", "Mais um Conteudo"));
        no3.enviarMensagem(sistema, no2);
        no2.receberMensagem(no3.getMessagem());
    }
}
