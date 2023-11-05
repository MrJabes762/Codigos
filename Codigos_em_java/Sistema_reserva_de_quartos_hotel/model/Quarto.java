public class Quarto {
    private int iD;
    private String tipo;
    private double valor;
    private int capacidade;
    public Quarto(int iD, String tipo, double valor, int capacidade) {
        setiD(iD);
        setTipo(tipo);
        setValor(valor);
        setCapacidade(capacidade);
    }
    public int getiD() {
        return iD;
    }
    public void setiD(int iD) {
        this.iD = iD;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    @Overide
    public boolean equals (Object obj){

    }

}
