package br.edu.ifba.saj.ads.poo;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anterior = 0;
        int sucessor = 1;
        int enesimo;
        System.out.println("-> Informe o quantos termos deseja imprimir: ");
        enesimo = ler.nextInt();
        System.out.printf( "%d, %d", anterior, sucessor);
        for (int i = 2; i < enesimo; i++) {
            sucessor += anterior;
            System.out.printf(", %d", sucessor);
            anterior = sucessor - anterior;
        }
    }
}
