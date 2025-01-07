package br.edu.ifba.saj.ads.poo;
//1. Imprima todos os múltiplos de 3, entre 1 e 100.
public class Exercicio3 {
    public static void main(String [] args) {
        int multiplos;
        for (int i = 0; i <= 100; i++){
            multiplos = multiplos * i;
            System.out.printf ("Multiplo = %d", multiplos);
        }
    }
}
