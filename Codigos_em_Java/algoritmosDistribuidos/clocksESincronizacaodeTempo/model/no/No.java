package model.no;

// Classe Pai que representa uma abstração genérica de um nó 
public class No {
    // Será incrementado conforme o início da contagem
    public static int contador;
    // Uma identificação mínima do nó
    private String identificacao;

    public No(String identificacao) { // Construtor do Objeto
        setIdentificacao(identificacao);
    }

    // Métodos de acesso 
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

    // Método toString para retornar os valores dos atributos (em string) em tempo de execução;
    @Override
    public String toString() {
        return "{" +
            " identificacao='" + getIdentificacao() + "'" +
            "}";
    }
}
