package estadoGlobalECapturadeEstado.model;

import java.util.ArrayList;
import java.util.List;

// Classe modelo de Representaçao do Processo 
public class Processo {
    //Atributos 
    private int id;
    private boolean gravando;//Variavel de controle de gravação de estado
    private List<String> estado;// lista de estado local
    private List<String> canalEstado;//lista de estado global com foco nas mensagens em tempo de execução
    private List<Processo> vizinhos;// vizinhos associados a cada processo 

    //Construtor que recebe apenas o id
    public Processo(int id) {
        setId(id);
        setGravando(false);
        setEstado(new ArrayList<>());
        setCanalEstado(new ArrayList<>());
        setVizinhos(new ArrayList<>());
    }
    //construtor padrão 
    public Processo() {
    }

    //Método de adição de vizinhos a lista 
    public void adicionarVizinho(Processo vizinho) {
        getVizinhos().add(vizinho);
    }
    // Metodo de receber a mensagem e adiconar a lista do canal 
    public String recebendoMensagem(String mensagem) {
        getCanalEstado().add(mensagem);
        return "Processo " + getId() + ": " + getCanalEstado();
    }
    //Metodo de Receber o marcador 
    public void recebeMarcador() {
        if (!isGravando()) {//verificação de gravação antes de proceguir 
            setGravando(true);
            if(isGravando()){
                salvaEstado();//Primeiro a salfa do estado 
                enviaMarcador(new ArrayList<>());//Depois o envio de marcadores 
            }
        }
    }
    // Metodo de Salva de estado 
    private void salvaEstado() {
        getEstado().add("Estado do Processo: " + toString());
    }
    //Metodo de envio de marcadores 
    private void enviaMarcador(List<Integer> visitados) {
        visitados.add(getId());
        for (Processo vizinho : getVizinhos()) {// verificando se dentre a lista de visinhos 
            if (!visitados.contains(vizinho.getId())) {// não tiver algum que não esteja visitado 
                vizinho.recebeMarcador();//ele recebe o marcador 
            }
        }
    }
    //Metodo de printar o estado 
    public String printEstado() {
        return "Estado do processo: " + String.join(", ", getEstado()) + " Estado do Canal do Processo: " + String.join(", ", getCanalEstado());
    }

    //Metodos de acesso
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isGravando() {
        return this.gravando;
    }

    public void setGravando(boolean gravando) {
        this.gravando = gravando;
    }

    public List<String> getEstado() {
        return estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }

    public List<String> getCanalEstado() {
        return canalEstado;
    }

    public void setCanalEstado(List<String> canalEstado) {
        this.canalEstado = canalEstado;
    }

    public List<Processo> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<Processo> vizinhos) {
        this.vizinhos = vizinhos;
    }
    //Metodo utilizao pelo anterior para retornar o estado dos atributos
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", gravando='" + isGravando() + "'" +
            ", canalEstado='" + getCanalEstado() + "'" +
            ", vizinhos='" + getVizinhos().stream().map(Processo::getId).toList() + "'" +
            "}";
    }
}
