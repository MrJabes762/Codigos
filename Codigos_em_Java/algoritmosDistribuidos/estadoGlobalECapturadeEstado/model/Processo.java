package estadoGlobalECapturadeEstado.model;

import java.util.ArrayList;
import java.util.List;

public class Processo {
    private int id;
    private boolean gravando;
    private List<String> estado;
    private List<String> canalEstado;
    private List<Processo> vizinhos;

    public Processo(int id) {
        setId(id);
        setGravando(false);
        setEstado(new ArrayList<>());
        setCanalEstado(new ArrayList<>());
        setVizinhos(new ArrayList<>());
    }

    public Processo() {
    }

    public void adicionarVizinho(Processo vizinho) {
        getVizinhos().add(vizinho);
    }

    public String recebendoMensagem(String mensagem) {
        getCanalEstado().add(mensagem);
        return "Processo " + getId() + ": " + getCanalEstado();
    }

    public void recebeMarcador() {
        if (!isGravando()) {
            setGravando(true);
            if(isGravando()){
                salvaEstado();
                enviaMarcador(new ArrayList<>());
            }
        }
    }

    private void salvaEstado() {
        getEstado().add("Estado do Processo: " + toString());
    }

    private void enviaMarcador(List<Integer> visitados) {
        visitados.add(getId());
        for (Processo vizinho : getVizinhos()) {
            if (!visitados.contains(vizinho.getId())) {
                vizinho.recebeMarcador();
            }
        }
    }

    public String printEstado() {
        return "Estado do processo: " + String.join(", ", getEstado()) + " Estado do Canal do Processo: " + String.join(", ", getCanalEstado());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", gravando='" + isGravando() + "'" +
            ", canalEstado='" + getCanalEstado() + "'" +
            ", vizinhos='" + getVizinhos().stream().map(Processo::getId).toList() + "'" +
            "}";
    }

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
}
