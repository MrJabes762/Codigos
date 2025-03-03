package model.no;

public class No {
    
    public static int contador;
    private String identificacao;

    public No (String identificacao){
        setIdentificacao(identificacao);
    }

    protected static int getContador() {
        return contador;
    }

    protected static void setContador(int contador) {
        No.contador = contador;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "{" +
            " identificacao='" + getIdentificacao() + "'" +
            "}";
    }
}
