package br.edu.ifba.saj.ads.poo;

//Imprima os fatoriais de 1 a 10.

class Main {
    public static void main(String[] args) {
        int fat = 1;
        int num = 10;
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
