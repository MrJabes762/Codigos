public class Ingresso {
    private String nomeDoEvento;
    private int quantidadeDeIngressos;
    private Evento evento;
    private double valor;
    public Ingresso(String nomeDoEvento, int quantidadeDeIngressos) {
        this.nomeDoEvento = nomeDoEvento;
        this.quantidadeDeIngressos = quantidadeDeIngressos;
    }
    public String getNomeDoEvento() {
        return nomeDoEvento;
    }
    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }
    public int getQuantidadeDeIngressos() {
        return quantidadeDeIngressos;
    }
    public void setQuantidadeDeIngressos(int quantidadeDeIngressos) {
        this.quantidadeDeIngressos = quantidadeDeIngressos;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
