#include <stdio.h>
#include <locale.h>

int main (){

    setlocale (LC_ALL, "Portuguese");
    float D, R, C;
    printf ("=============================================================");
    printf ("\n");
    printf ("\n-> Informe o valor da cotação do dolar: ");
    scanf ("%f", &C);
    printf ("\n");
    printf ("\n=========================================================");
    printf ("\n");
    printf ("\n-> Informe o valor (em reais) para a converção: ");
    scanf ("%f", &R);
    printf ("\n");
    printf ("\n===========================================================");
    printf ("\n");
        D =  R/C;
    printf ("\n-> O valor disponível em dólares é: US$ %.2f", D);
    printf ("\n");
    printf ("\n=============================================================");
}
