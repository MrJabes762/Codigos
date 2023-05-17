package br.edu.ifba.saj.ads.poo;

public class Item {
    private String nome;
    private String ingredientes;
    private int tempoDePreparomin;
    private String id;
    private double valorunitario;

    public Item(String nome, String ingredientes, int tempoDePreparomin, String id, double d) {
        setNome(nome);
        setIngredientes(ingredientes);
        setTempoDePreparo(tempoDePreparomin);
        setId(id);
        setValorunitario(d);
    }

    public String getNome() {// concluido
        return this.nome;
    }

    public void setNome(String nome) {// concluido
        this.nome = nome;
    }

    public String getIngredientes() {// cocluido
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {// concluido
        this.ingredientes = ingredientes;
    }

    public int getTempoDePreparo() {
        return this.tempoDePreparomin;
    }

    public void setTempoDePreparo(int tempoDePreparo) {// concluido
        this.tempoDePreparomin = tempoDePreparo;
    }

    private void setId(String id) {// concluido
        this.id = id;
    }

    public String getId() {// concluido
        return this.id;
    }

    public double getValorunitario() {// concluido
        return this.valorunitario;
    }

    public void setValorunitario(double d) {// concluido
        this.valorunitario = d;
    }

    public boolean verificarItem(String nomedoitem0) {// concluido
        return getNome().equals(nomedoitem0);
    }
}
