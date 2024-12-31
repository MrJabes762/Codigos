package br.edu.ifba.saj.ads.poo;

public class Tv {
    int tamanho;
    int volume;
    String marca;
    Voltagem voltage;
    int canal;
    boolean isligado;

    Tv(String marca, int tamanho, Voltagem voltage) {
        this.marca = marca;
        this.volume = 5;
        this.tamanho = tamanho;
        this.canal = 2;
        this.voltage.valor = voltage.valor;
    }

    public boolean ligar() {
        this.isligado = true;
        System.out.println("Consumo: " + this.voltage.valor * this.tamanho);
        return this.isligado;
    }

    public void desligar() {
        if (ligar()) {
            do {
                DescerCanal();
            } while (DescerCanal() > 2);
            do {
                DiminuirVolume();
            } while (DiminuirVolume() > 0);
            this.isligado = false;
        }
    }

    public void AumentarVolume() {
        if (ligar()) {
            this.volume++;
        }
    }

    public int DiminuirVolume() {
        if (ligar()) {
            this.volume--;
        }
        return this.volume;
    }

    public void SubirCanal() {
        if (ligar()) {
            canal++;
        }
    }

    public int DescerCanal() {
        if (ligar()) {
            this.canal--;
        }
        return this.canal;
    }
}
