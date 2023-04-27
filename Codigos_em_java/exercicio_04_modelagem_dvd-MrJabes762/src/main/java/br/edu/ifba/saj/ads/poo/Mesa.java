package br.edu.ifba.saj.ads.poo;

public class Mesa {
    public static void main(String[] args) {
        DVD dvd1 = new DVD();
        Filme filme1 = new Filme("Githuub", "Terrro",126);
        Filme filme2 = new Filme ("Pull requeste","Comedia", 60);
        System.out.println(filme1.toString());
        System.out.println(filme2.toString());
    }
}
