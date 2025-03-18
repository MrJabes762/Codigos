import java.util.ArrayList;
import java.util.List;

public class Perifericos implements Componente {
    private String tipo;
    private List<Componente> componentes;
    
    public Perifericos() {
    }
    public Perifericos(String tipo) {
        setTipo(tipo);
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
    @Override
    public String toString() {
        return "{"
                + getClass().toString()
                + ": marca='"
                + getTipo()
                + "', componentes='"
                + getComponentes()
                + "'"
                + "}";
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
    
    
}
