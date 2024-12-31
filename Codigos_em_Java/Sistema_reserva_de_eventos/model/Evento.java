public class Evento {
    private String nome;
    private String data;
    private String local;
    private int quantidade;
    private double valordoIngresso;
    public Evento(String nome, String data, String local, int quantidade, double valordoIngresso) {
        setNome(nome);
        setData(data);
        setLocal(local);
        setQuantidade(quantidade);
        setValordoIngresso(valordoIngresso);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValordoIngresso() {
        return valordoIngresso;
    }
    public void setValordoIngresso(double valordoIngresso) {
        this.valordoIngresso = valordoIngresso;
    }
    
}
