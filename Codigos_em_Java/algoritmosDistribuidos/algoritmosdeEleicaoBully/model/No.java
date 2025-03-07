package algoritmosdeEleicaoBully.model;

import java.util.ArrayList;
import java.util.List;

import estadoGlobalECapturadeEstado.model.Processo;

public class No {

    private String nome;
    private int identificador;
    private int idLocal;
    private boolean isCoordenador;
    public static int idCont;
    private List<No> nosVizinhos;
    private String notificacao;

    public No(String string, int valorIdentificador) {
        setNome(string);
        setIdentificador(valorIdentificador);
        setIdLocal(No.idCont);
        setNosVizinhos(new ArrayList<>());
        setNotificacao("");
        setIsCoordenador(false);
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


    public List<No> getNosVizinhos() {
        return this.nosVizinhos;
    }

    public void setNosVizinhos(List<No> nosVizinhos) {
        this.nosVizinhos = nosVizinhos;
    }

    public String getNotificacao() {
        return this.notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", identificador='" + getIdentificador() + "'" +
            ", idLocal='" + getIdLocal() + "'" +
            ", isCoordenador='" + isIsCoordenador() + "'" +
            ", nosVizinhos='" + getNosVizinhos().stream().map(No::getIdLocal).toList() + "'" +
            ", notificacao='" + getNotificacao() + "'" +
            "}";
    }
    
}
