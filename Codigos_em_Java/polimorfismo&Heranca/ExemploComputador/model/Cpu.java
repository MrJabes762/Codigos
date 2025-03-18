
public class Cpu implements Componente {
    private String marca;

    public Cpu(String marca) {
        setMarca(marca);
    }

    @Override
    public void adicionar(Componente c) {
        // Objeto Folha não suporta essa operação
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void remover(Componente c) {
        // Objeto Folha não suporta essa operação
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public Componente getFilho(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilho'");
    }

    @Override
    public String toString() {
        return "{"
                + getClass().getName().toString()
                + ": marca='" + getMarca() 
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
