package br.edu.ifba.saj.ads.poo;
import java.util.Scanner;
/*1. Imprima a seguinte tabela, usando fors encadeados:
```console
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
``` */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n;
        int soma = 0;

        System.out.println("-> Informe um valor inteiro: ");
        n = ler.nextInt();
            for (int i = 1; i <= n; i++){
                soma = 0;
                for (int j = 1; j <= i; j++){
                    soma += i;
                    System.out.printf("%d ", soma);
                }
                System.out.println("");
            }
    }
}
