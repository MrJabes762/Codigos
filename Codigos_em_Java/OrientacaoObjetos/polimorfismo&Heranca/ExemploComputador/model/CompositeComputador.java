
import java.util.ArrayList;
import java.util.List;

public class CompositeComputador implements Componente {

    private List<Componente> componentes;

    public CompositeComputador () {
        setComponentes(new ArrayList<>());
    }

    @Override
    public void adicionar(Componente c) {
        getComponentes().add(c);
    }

    @Override
    public void remover(Componente c) {
        getComponentes().remove(c);
    }

    @Override
    public Componente getFilho(int i) {
        return getComponentes().get(i);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return "{" + getClass().toString()
                + ": componentes='" 
                + getComponentes() 
                + "'"
                + "}";
    }

}
