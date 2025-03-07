package algoritmosdeEleicaoBully.model;

import java.util.ArrayList;
import java.util.List;

import estadoGlobalECapturadeEstado.model.Processo;

// Classe de representação do Objeto No
public class No {

    //Atributos 
    private String nome;// Nome do no
    private int identificador;// identificador que será manipulado durante a execução 
    private int idLocal;// Id do no
    private boolean isCoordenador;//Variavel de controle para identificação do coordenador 
    public static int idCont;//seŕa icrementado conforme a criação dos objetos 
    private List<No> nosVizinhos;// Lista de vizinhos que serão notificados
    private String notificacao;// a notificação que será atribuida 

    //Construtor 
    public No(String string, int valorIdentificador) {
        setNome(string);
        setIdentificador(valorIdentificador);
        setIdLocal(No.idCont);
        setNosVizinhos(new ArrayList<>());
        setNotificacao("");
        setIsCoordenador(false);
    }
    //Metodos de acesso 
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

    //To string - para retorar os valores dos atributos 
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
