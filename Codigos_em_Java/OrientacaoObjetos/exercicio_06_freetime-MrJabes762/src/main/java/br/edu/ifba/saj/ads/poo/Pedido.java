package br.edu.ifba.saj.ads.poo;

public class Pedido {
    private int quantidade;
    private Cardapio cardapiopronto;
    private Item itemrecebidodocardapio;

    public Pedido(String nomedoItem, int quantidade) {
        setItemrecebidodocardapio(fazerPedido(nomedoItem));
        setQuantidade(quantidade);
    }

    private void setQuantidade(int quantidade) {// Concluido
        this.quantidade = quantidade;
    }

    private Item fazerPedido(String nomedoItem) {// conclulido
        if ((quantidade > 0) && (cardapiopronto.itemEmcontrado(nomedoItem))) {
            return cardapiopronto.pegarItemdoCardapio(nomedoItem);
        }
        return null;
    }

    public int getQuantidadeItemdopedido() {// concluido
        return this.quantidade;
    }

    private void setItemrecebidodocardapio(Item itemrecebidodocardapio) {// Concluido
        this.itemrecebidodocardapio = itemrecebidodocardapio;
    }

    public double getValorunitariodoItemdopedido() {// concluido
        return this.itemrecebidodocardapio.getValorunitario();
    }
}
