package algoritmosdeEleicaoBully.model;

public class No {

    private String nome;
    private int identificador;
    private int idLocal;
    private boolean isCoordenador;
    public static int idCont;

    public No(String string, int valorIdentificador) {
        setNome(string);
        setIdentificador(valorIdentificador);
        setIdLocal(No.idCont);
    }

    public void setCoordenador(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCoordenador'");
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public boolean isIsCoordenador() {
        return this.isCoordenador;
    }

    public boolean getIsCoordenador() {
        return this.isCoordenador;
    }

    public void setIsCoordenador(boolean isCoordenador) {
        this.isCoordenador = isCoordenador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "{"
                + " nome='" + getNome() + "'"
                + ", identificador='" + getIdentificador() + "'"
                + ", idLocal='" + getIdLocal() + "'"
                + ", isCoordenador='" + isIsCoordenador() + "'"
                + "}";
    }
}
