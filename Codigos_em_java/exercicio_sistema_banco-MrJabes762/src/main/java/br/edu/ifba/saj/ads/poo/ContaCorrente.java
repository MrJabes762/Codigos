package br.edu.ifba.saj.ads.poo;

public class ContaCorrente extends Conta {

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
    
    public void atualiza(double taxa) {
        this.saldo += saldo * (2*(1 + taxa));
    }

}
