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

    public void recebendoMensagem(String mensagem) {
        if(isGravando()){
            getCanalEstado().add(mensagem);
        }
        System.out.println("Processo " + getId() + ": " + getCanalEstado());
    }

    public void recebeMarcador (){
        if(!isGravando()){
            setGravando(true);
            if(isGravando()){
                salvaEstado();
                enviaMarcador();
            }
        }
    }

    private void salvaEstado (){
        getEstado().add("Estado do Processo: " + toString());
    }
    private void enviaMarcador (){
        getVizinhos().forEach(vizinho -> vizinho.recebeMarcador());
    }

    public String printEstado() {
        return "Estado do processo: " + getEstado() + " Estado do Canal do Processo: " + getCanalEstado();
    }
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", gravando='" + isGravando() + "'" +
            ", estado='" + getEstado() + "'" +
            ", canalEstado='" + getCanalEstado() + "'" +
            ", vizinhos='" + getVizinhos() + "'" +
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
        return this.estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }

    public List<String> getCanalEstado() {
        return this.canalEstado;
    }

    public void setCanalEstado(List<String> canalEstado) {
        this.canalEstado = canalEstado;
    }

    public List<Processo> getVizinhos() {
        return this.vizinhos;
    }

    public void setVizinhos(List<Processo> vizinhos) {
        this.vizinhos = vizinhos;
    }

}
