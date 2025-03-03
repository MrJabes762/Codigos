package service;

import java.time.LocalDate;
import model.Mensagem;
import model.no.No;
import model.no.No1;


public class SistemaDistribuidodeClocksESincronizacaoDetempo {
    private LocalDate timeStampSistema;
    private Mensagem mensagem;

    public SistemaDistribuidodeClocksESincronizacaoDetempo() {
        setTimeStampSistema(LocalDate.now());
        System.out.println("Sistema Online em: " + getTimeStampSistema());
    }
    
    public Mensagem criarMensagem (String titulo, String conteudo){
        No.contador++;
        System.out.println("Mensagem Criada em: " + getTimeStampSistema() + " Clock do Sistema Inicial " + No.contador);
        setMensagem(new Mensagem(titulo, conteudo, No.contador));
        return getMensagem();
    }

    public Mensagem enviarMensagem (Mensagem mensagem, No1 destinatario){
        No.contador++;
        mensagem.setDestinatario(destinatario);
        mensagem.setTimeStamp(No.contador);
        destinatario.receberMensagem(mensagem);
        setMensagem(mensagem);
        System.out.println("Mensagem enviada " + mensagem.toString());
        return mensagem;
    }

    public void atualzarClock (Mensagem mensagemRecebida){
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
