package br.edu.ifba.saj.ads.poo;
//1. Imprima a soma de 1 até 1000.
public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 1000; i++){
            soma += i;
            System.out.println("Soma = "+ soma);
        }
    }
}
