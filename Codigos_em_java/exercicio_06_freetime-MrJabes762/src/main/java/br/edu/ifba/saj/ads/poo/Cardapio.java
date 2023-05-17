package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Item> itens;
    private Item item;

    public Cardapio() {
        this.itens = new ArrayList<>();
    }

    public void addItensNoCardápio(Item item) {// concluido
        itens.add(item);
    }

    public ArrayList<Item> getItensdocardapio() {// concluido
        return this.itens;
    }

    public boolean itemEmcontrado(String nomedoitem0) {// concluido
        for (int i = 0; i < itens.size(); i++) {
            if (item.verificarItem(nomedoitem0)) {
                return true;
            }
        }
        return false;
    }

    public Item pegarItemdoCardapio(String nomedoitem1) {// concluido
        for (int i = 0; i < itens.size(); i++) {
            if (itemEmcontrado(nomedoitem1)) {
                return itens.get(i);
                break;
            }
        }
        return null;
    }
}
