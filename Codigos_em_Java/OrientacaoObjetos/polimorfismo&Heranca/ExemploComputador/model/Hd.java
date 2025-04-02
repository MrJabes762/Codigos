
public class Hd implements Componente {
    private String marca;

    public Hd() {
    }

    public Hd(String marca) {
        setMarca(marca);
    }
    
    @Override
    public void adicionar(Componente c) {
        // Método não suportado para folhas
    }

    @Override
    public void remover(Componente c) {
        // Método não suportado para folhas
    }

    @Override
    public Componente getFilho(int i) {
        // Método não suportado para folhas
        return null;
    }

    @Override
    public String toString() {
        return "{"
                + getClass().getName().toString()
                + ": marca='"
                + getMarca()
                + "'"
                + "}";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
