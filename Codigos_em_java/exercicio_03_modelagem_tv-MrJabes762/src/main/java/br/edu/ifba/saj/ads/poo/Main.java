package br.edu.ifba.saj.ads.poo;

public class Main {
    public static void main(String[] args) {
        Tv televisao = new Tv("LG",40,Voltagem.V110); 
        televisao.ligar();
        televisao.AumentarVolume();
        televisao.AumentarVolume();
        televisao.AumentarVolume();
        televisao.SubirCanal();
        televisao.SubirCanal();
        televisao.DescerCanal();
        televisao.DiminuirVolume();
        televisao.desligar();
    }
}
