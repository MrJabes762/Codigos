package br.edu.ifba.saj.ads.poo;

public class Filme {
    String Nome;
    String Categoria;
    int Duracao;

    public Filme(String nome, String categoria, int duracao) {
        this.Nome = nome;
        this.Categoria = categoria;
        this.Duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme [Nome=" + Nome + ", Categoria=" + Categoria + ", Duracao=" + Duracao + "]";
    }
}
