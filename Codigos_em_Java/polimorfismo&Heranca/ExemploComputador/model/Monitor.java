
public class Monitor implements Componente {
    private String marca;

    public Monitor() {
    }

    public Monitor(String marca) {
        setMarca(marca);
    }

    @Override
    public void adicionar(Componente c) {
        // Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void remover(Componente c) {
        // Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public Componente getFilho(int i) {
        // Método não suportado para folhas
        throw new UnsupportedOperationException("Unimplemented method 'getFilho'");
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
