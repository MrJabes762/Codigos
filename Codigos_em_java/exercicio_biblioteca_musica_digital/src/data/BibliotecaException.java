package data;

public class BibliotecaException extends Exception{
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public BibliotecaException (String mesagem){
        setMensagem(mesagem);
    }
}
