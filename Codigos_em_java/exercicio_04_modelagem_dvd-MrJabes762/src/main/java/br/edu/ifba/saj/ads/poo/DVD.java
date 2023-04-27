package br.edu.ifba.saj.ads.poo;

public class DVD {
    boolean isligado;
    int volume;
    Filme filme;
    boolean Deuplay;

    DVD() {
        this.volume = 2;
        this.isligado = false;
        this.Deuplay = false;
    }

    public void Ligar() {
        this.isligado = true;
    }

    public void Desligar() {
        this.isligado = false;
    }

    public void Aumentarvolume() {
        if (this.isligado && this.volume < 5) {
            this.volume++;
        }
    }

    public void Diminuirvolume() {
        if (this.isligado && (this.volume < 5 && this.volume >= 1)) {
            this.volume--;
        }
    }

    public void inserirFilme(Filme filme) {
        if (this.isligado && (this.filme == null)) {
            this.filme = filme;
        }
    }

    public void Darplay() {
        if (isligado && (this.filme != null)) {
            this.Deuplay = true;
        }
    }

    public void Stop() {
        if (this.Deuplay && (this.filme != null)) {
            this.Deuplay = false;
        }
    }

    @Override
    public String toString() {
        return "DVD [isligado=" + isligado + ", volume=" + volume + ", Deuplay=" + Deuplay + "]";
    }
    
}
