package br.edu.ifba.saj.ads.poo;
import java.util.Scanner;
/*1. Escreva um programa que, dada uma variável `x` com algum valor inteiro, temos um novo `x` de acordo com a seguinte regra:
   - se x é par, x = x / 2
   - se x é impar, x = 3 * x + 1
   - imprime x
   - O programa deve parar quando x tiver o valor final de 1. Por exemplo, 
   - para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */
public class Exercicio7 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int x;
      System.out.println("-> Informe um numero inteiro: ");
      x = ler.nextInt();
      do{
        if (x == 1){
          break;
        }
        if (x % 2 == 0){
          x = x / 2;
          System.out.println("x = "+ x);
        }else {
          x = 3 * x + 1;
          System.out.println("x = "+ x);
        }
      }while (x >= 1);
    }
}
