package model.no;

import model.Mensagem;
import service.SistemaDistribuidodeClocksESincronizacaoDetempo;

// Classe filha de No que implementará o corpo do nó 
public class No1 extends No {

    // Objeto Mensagem que faz parte do nó
    private Mensagem mensagem;
    // Representando o contador local de cada No
    private static int contadorLocal1;
    // o Objeto sistema que sera utilizado pelo no 
    private SistemaDistribuidodeClocksESincronizacaoDetempo sistema;

    private Mensagem mensagemRecebida;

    public No1(String identificacao) {
        super(identificacao); // Passando a identificacao para o pai 
        setContadorLocal1(getContador()); // Associando o contador local ao do pai
        setMensagem(new Mensagem()); // Uma mensagem com um construtor vazio
    }

    // Método de Envio que recebe o sistema que estara executando no momento e o No de destinatario
    public void enviarMensagem(SistemaDistribuidodeClocksESincronizacaoDetempo sistema, No1 destinatario) {
        // Setando o remetente para o objeto "Autoreferenciado" em tempo de execução 
        getMensagem().setRemetente(this);
        // Só para mostrar os valores dos atributos do objeto nesse momento 
        System.out.println(toString());
        setSistema(sistema);
        // O no solicita ao sistema para enviar a mensagem ao destinatario
        getSistema().enviarMensagem(getMensagem(), destinatario);
    }

    // Método de Recebimento de Mensagem 
    public void receberMensagem(SistemaDistribuidodeClocksESincronizacaoDetempo sistema, Mensagem mensagem) {
        setSistema(sistema);//Setando o sistema em execução 
        getSistema().atualizarClock(mensagem);//evocando a atualização do clock
        setMensagemRecebida(mensagem);//setando a mensagem recebida 
    }
    //Metodos de acesso 
    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public static int getContadorLocal1() {
        return contadorLocal1;
    }

    public static void setContadorLocal1(int contadorLocal1) {
        No1.contadorLocal1 = contadorLocal1;
    }

    public SistemaDistribuidodeClocksESincronizacaoDetempo getSistema() {
        return sistema;
    }

    public void setSistema(SistemaDistribuidodeClocksESincronizacaoDetempo sistema) {
        this.sistema = sistema;
    }

    public Mensagem getMensagemRecebida() {
        return this.mensagemRecebida;
    }

    public void setMensagemRecebida(Mensagem mensagemRecebida) {
        this.mensagemRecebida = mensagemRecebida;
    }
    // To String que retorna o estado dos atributos
    @Override
    public String toString() {
        return "{" +
            " mensagem='" + getMensagem() + "'" +
            ", sistema='" + getSistema() + "'" +
            "}";
    }
}
