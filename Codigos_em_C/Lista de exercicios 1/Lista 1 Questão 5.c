#include <stdio.h>
#include <locale.h>

int main (){

    setlocale (LC_ALL, "Portuguese");
    float D, R, C;
    printf ("=============================================================");
    printf ("\n");
    printf ("\n-> Informe o valor da cota��o do dolar: ");
    scanf ("%f", &C);
    printf ("\n");
    printf ("\n=========================================================");
    printf ("\n");
    printf ("\n-> Informe o valor (em reais) para a conver��o: ");
    scanf ("%f", &R);
    printf ("\n");
    printf ("\n===========================================================");
    printf ("\n");
        D =  R/C;
    printf ("\n-> O valor dispon�vel em d�lares �: US$ %.2f", D);
    printf ("\n");
    printf ("\n=============================================================");
}
