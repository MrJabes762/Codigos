package br.edu.ifba.saj.ads.poo;
/*  No código do exercício anterior, aumente 
a quantidade de números que terão os fatoriais impressos, 
até 20, 30, 40. Em um determinado momento, além desse cálculo 
demorar, vai começar a mostrar respostas completamente erradas.
 Por quê?
Mude de `int` para `long` para ver alguma mudança.*/

class Main {
    public static void main(String[] args) {
        int fat = 1;
        long num = 40;
        int cont = 1;
        do {

            for (int i = 1; i <= num; i++) {
                fat = fat * i;
            }

            System.out.println( + num +"!"+ " = " + fat);
            cont++;

        } while (cont < 2);
    }
}

