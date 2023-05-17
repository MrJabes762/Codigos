package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class Lanchonete {// criar pedido, passabdo os dados
    private String nome;
    private Cardapio cardapio;
    private Comprovante comprovante;
    private ArrayList<Pedido> pedidos;
    private float valortotal;
    private double pagamento;

    public Lanchonete(String nome) {
        setNome(nome);
        this.cardapio = null;
        this.pedidos = new ArrayList<>();
        this.valortotal = 0;
        this.pagamento = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarItensNoCardapio(Item item) {// concluido
        cardapio.addItensNoCardápio(item);
    }

    public ArrayList<Item> getExibircardapio() {// concluido
        return cardapio.getItensdocardapio();
    }

    public boolean criarPedido(String nomedoitem, int quantidade) {// concluido
        if ((nomedoitem != null) && (quantidade > 0)) {
            pedidos.add(new Pedido(nomedoitem, quantidade));
            return true;
        }
        return false;
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public float getValortotal() {
        return this.valortotal;
    }

    public void setValortotal() {// concluido
        for (int i = 0; i < pedidos.size(); i++) {
            this.valortotal += (pedidos.get(i).getValorunitariodoItemdopedido()
                    * pedidos.get(i).getQuantidadeItemdopedido());
        }
    }

    public double getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public boolean realizarPagamento(double d) {// concluido
        if ((d > 0) && (d <= getValortotal())) {
            setPagamento(d - getValortotal());
            this.comprovante = new Comprovante(getPedidos(), getValortotal());
            return true;
        }
        return false;
    }

    public Comprovante exibirComprovante() {
        return this.comprovante;
    }

    public boolean retirarPedido(Comprovante comprovante) {// comcluido
        if (comprovante.verificacao(comprovante)) {
            comprovante.getPedidos().clear();
            return true;
        }
        return false;
    }
}
