package br.edu.ifba.saj.ads.poo;

//Lanchonete (retirar lanche)
//Item
//Pedido (Pagamento,compovante)
//Cliente
//Cliente escolher itens 
//lista de itens (lanchonete)
//adicionar item ao pedido
// realizar agamento 
// apresentaer compprovante
// retirar lanche
public class Roteiro {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete("LanchoneteFreeTime");
        lanchonete.cadastrarItensNoCardapio(new Item("Coxinha", "Frango,Catupiri,carne", 20, "123", 3.50));
        lanchonete.cadastrarItensNoCardapio(new Item("Pastel de Forno", "Carne, patê", 40, "312", 4.00));
        lanchonete.cadastrarItensNoCardapio(new Item("Pastel Frito", "Calabresa, queijo, presunto", 15, "342", 5));
        lanchonete.cadastrarItensNoCardapio(new Item("Esfirra", "Carne,Queijo", 15, "653", 3.00));
        lanchonete.getExibircardapio();
        lanchonete.criarPedido("Coxinha", 1);
        lanchonete.criarPedido("Pastel Frito", 2);
        lanchonete.getPedidos();
        lanchonete.getValortotal();
        lanchonete.realizarPagamento(13.50);
        lanchonete.retirarPedido(lanchonete.exibirComprovante());
    }
}
