package model;

import model.no.No;

public class Mensagem {
    private String titulo;
    private String conteudo;
    private No remetente;
    private No destinatario;
    private long timeStamp;

    public Mensagem() {
    }


    public Mensagem(String titulo, String conteudo, No remetente, No destinatario) {
        setTitulo(titulo);
        setConteudo(conteudo);
        setRemetente(remetente);
        setDestinatario(destinatario);
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getRemetente() {
        return this.remetente;
    }

    public void setRemetente(No remetente) {
        this.remetente = remetente;
    }


    public No getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(No destinatario) {
        this.destinatario = destinatario;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", conteudo='" + getConteudo() + "'" +
            ", remetente='" + getRemetente().toString() + "'" +
            ", destinatario='" + getDestinatario().toString() + "'" +
            ", timeStamp='" + getTimeStamp() + "'" +
            "}";
    }
    
}
