#include<stdio.h>

int main () {

    int valor1;
    printf ("===============================");
    printf ("\n");
    printf ("\nInforme um valor inteiro: ");
    scanf ("%d", &valor1);
    printf ("\n");
    if (valor1%2 == 0){
        printf ("============================");
        printf ("\n");
        printf ("\nO valor digitado e par");
        printf ("\n");
        printf ("\n============================");
}
    else{
        printf ("================================");
        printf ("\n");
        printf ("\nO valor digitado e impar ");
        printf ("\n");
        printf ("\n================================");
    }
}
