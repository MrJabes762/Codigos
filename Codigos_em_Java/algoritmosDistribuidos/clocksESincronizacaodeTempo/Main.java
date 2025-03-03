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
        
    }
}
