package service;

import java.time.LocalDate;
import model.Mensagem;
import model.no.No;
import model.no.No1;

//Classe que representa o Sistema de Clocks e Sincronização de tempo 
public class SistemaDistribuidodeClocksESincronizacaoDetempo {
    //Evocando a classe Local date só para simular o TimeStamp do Sistema
    private LocalDate timeStampSistema;
    // Objeto Mensagem que será amplamente utilizado nos metodos
    private Mensagem mensagem;


    //Construtor do Objeto
    public SistemaDistribuidodeClocksESincronizacaoDetempo() {
        setTimeStampSistema(LocalDate.now());//Setando o timestamp do instante
        setMensagem(new Mensagem());
        System.out.println("Sistema Online em: " + getTimeStampSistema());
    }
    
    //Metodo de criação da Mensagem recebendo o titulo e o conteudo 
    public Mensagem criarMensagem(String titulo, String conteudo) {
        No.contador++;//a incrementação do contador 
        System.out.println("Mensagem Criada em: " + getTimeStampSistema() + " Clock do Sistema Inicial " + No.contador);
        //Setando as informações referentes a mensagem com o timestamp
        getMensagem().setTitulo(titulo);
        getMensagem().setConteudo(conteudo);
        getMensagem().setTimeStamp(No.contador);
        return getMensagem();//retornando o objeto para o objeto mensagem que será utilizado
    }

    // Método de envio de mensagem Recendo a mensagem e o no de destiatário 
    public Mensagem enviarMensagem(Mensagem mensagem, No1 destinatario) {
        No.contador++;// contador imcrementado 
        //set das informações;
        mensagem.setDestinatario(destinatario);
        mensagem.setTimeStamp(No.contador);
        destinatario.receberMensagem(this, mensagem);
        setMensagem(mensagem);
        System.out.println("Mensagem enviada " + mensagem.toString());
        return mensagem;
    }

    public void atualizarClock(Mensagem mensagemRecebida) {
        No.contador = (int) (Math.max(No.contador, mensagemRecebida.getTimeStamp()) + 1);
        System.out.println("Mensagem Recebida " + mensagemRecebida.toString());
    }

    public LocalDate getTimeStampSistema() {
        return this.timeStampSistema;
    }

    public void setTimeStampSistema(LocalDate timeStampSistema) {
        this.timeStampSistema = timeStampSistema;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
}
