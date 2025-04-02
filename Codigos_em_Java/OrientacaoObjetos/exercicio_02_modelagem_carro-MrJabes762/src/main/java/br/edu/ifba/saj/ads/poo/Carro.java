package br.edu.ifba.saj.ads.poo;

public class Carro {
    String modelo;
    int velocidade;
    float aceleracao = 1;
    int marcha;
    boolean isligado = false;
    boolean isEsquerda = false;

    public void ligar (){
        this.isligado = true;
    }
    public void desligar () {
        this.isligado = false;
    }
    public void acelerar () {
        if (isligado){
            this.velocidade++;
            this.aceleracao++;
        }
    }
    public void desacelerar () {
        if (isligado){
            this.velocidade--;
            this.aceleracao--;
        }
    }
    public void isdireita () {
        this.isEsquerda = false;
    }
    public void isesquerda() {
        this.isEsquerda = true;
    }
    public void marchaCima() {
        this.marcha++;
    }
    public void marchaBaixo() {
        this.marcha--;
    }
}
