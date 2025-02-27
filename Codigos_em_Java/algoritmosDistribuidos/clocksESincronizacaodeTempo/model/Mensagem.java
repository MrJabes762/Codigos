package model;

public class Mensagem {
    private String titulo;
    private String conteudo;
    private String remetente;
    private String destinatario;
    private String data;


    public Mensagem(String titulo, String conteudo, String remetente, String destinatario, String data) {
        setTitulo(titulo);
        setConteudo(conteudo);
        setRemetente(remetente);
        setDestinatario(destinatario);
        setData(data);
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

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
