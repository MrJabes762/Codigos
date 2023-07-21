package br.edu.ifba.saj.ads.poo;



public class ContaPoupanca extends Conta{

    
    public void deposita(int i) {
    }

    public void atualiza(double taxa) {
        this.saldo += saldo * (3*(1 + taxa));
    }

}
