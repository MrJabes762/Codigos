package br.edu.ifba.saj.ads.poo;

public class Conta {
    protected double saldo;
    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
    }

    public void saca(double valor) {
    }

    public void atualiza(double taxa) {
        this.saldo += saldo * (1 + taxa);
    }

}
