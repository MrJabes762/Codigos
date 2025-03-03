package service;

import java.time.LocalDate;
import java.time.ZoneId;

import model.Mensagem;
import model.no.No;
import model.no.No1;

public class SistemaDistribuidodeClocksESincronizacaoDetempo {
    private LocalDate timeStampSistema;

    public SistemaDistribuidodeClocksESincronizacaoDetempo() {
        setTimeStampSistema(LocalDate.now());
        System.out.println("Sistema Online em: " + getTimeStampSistema());
    }
    
    public Mensagem criarMensagem (String titulo, String conteudo){
        No.contador++;
        System.out.println("Mensagem Criada em: " + getTimeStampSistema() + "Clock do Sistema Incial" + No.contador);
        return new Mensagem(titulo, conteudo , null, null);
    }

    public Mensagem enviarMensagem (Mensagem mensagem, No1 destinatario){
        No.contador++;
        mensagem.setDestinatario(destinatario);
        mensagem.setTimeStamp(getTimeStampSistema().atZone(ZoneId.systemDefault()).toEpochSecond());
        destinatario.setMessagem(mensagem);
        System.out.println("Mensagem enviada "+ mensagem.toString());
        return mensagem;
    }

    public void atualzarClock (Mensagem mensagem){
        No.contador++;
        mensagem.setTimeStamp(getTimeStampSistema().atZone(ZoneId.systemDefault()).toEpochSecond());
        System.out.println("Mensagem Recebida " + mensagem.toString());
    }

    public LocalDate getTimeStampSistema() {
        return this.timeStampSistema;
    }

    public void setTimeStampSistema(LocalDate timeStampSistema) {
        this.timeStampSistema = timeStampSistema;
    }
}
