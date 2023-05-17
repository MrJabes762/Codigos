package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Calendar;

public class Comprovante {// concertar
    private Calendar dataehoradeagora;
    private float valortotal;
    private ArrayList<Pedido> pedidos;

    public Comprovante(ArrayList<Pedido> pedidos, float valortotal2) {
        setPedidos(pedidos);
        setValortotal(valortotal2);
        setDataehoradeagora();
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    private void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Calendar getDataehoradeagora() {// cocluido
        return dataehoradeagora;
    }

    public void setDataehoradeagora() {// concluido
        this.dataehoradeagora.getInstance();
    }

    public float getValortotal() {// concluido
        return this.valortotal;
    }

    public void setValortotal(Float valortotal) {// concluido
        this.valortotal = valortotal;
    }

    public boolean verificacao(Comprovante comprovante) {// concluido
        return (getPedidos().equals(comprovante.getPedidos()));
    }
}
