package model;

import model.no.No1;

// Modelo de representação do Objeto Mensagem 
public class Mensagem {
    
    //Atributos 
    private String titulo;
    private String conteudo;
    private No1 remetente;
    private No1 destinatario;
    private long timeStamp;

    //Cosntrutores Sobrecarregados
    public Mensagem() {
    }

    public Mensagem(String titulo, String conteudo) {
        setTitulo(titulo);
        setConteudo(conteudo);
    }

    public Mensagem(String titulo, String conteudo, long timeStamp) {
        setTitulo(titulo);
        setConteudo(conteudo);
        setTimeStamp(timeStamp);
    }

    // Métodos de Acesso 
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

    public No1 getRemetente() {
        return this.remetente;
    }

    public void setRemetente(No1 remetente) {
        this.remetente = remetente;
    }

    public No1 getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(No1 destinatario) {
        this.destinatario = destinatario;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    //To String que retorna os valores dos Atributos em String
    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", conteudo='" + getConteudo() + "'" +
            ", remetente='" + (getRemetente() != null ? getRemetente().getIdentificacao() : "null") + "'" +
            ", destinatario='" + (getDestinatario() != null ? getDestinatario().getIdentificacao() : "null") + "'" +
            ", timeStamp='" + getTimeStamp() + "'" +
            "}";
    }
}
