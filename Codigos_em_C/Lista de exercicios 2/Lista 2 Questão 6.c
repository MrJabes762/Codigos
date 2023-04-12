#include <stdio.h>
#include <locale.h>

int main () {
    setlocale (LC_ALL, "Portuguese");
    int valor1;
    printf ("=================================");
    printf ("\n");
    printf ("\n-> Informe um valor inteiro: ");
    scanf ("%d", &valor1);
    printf ("\n");
    if (valor1 == 0){
        printf ("================================");
        printf ("\n");
        printf ("\n-> O valor digitado é 0");
        printf ("\n");
        printf ("\n================================");
    }else if (valor1 % 2 == 0){
        printf ("============================");
        printf ("\n");
        printf ("\n-> O valor digitado e par");
        printf ("\n");
        printf ("\n============================");
    }else if (valor1 % 2 != 0){
        printf ("================================");
        printf ("\n");
        printf ("\n-> O valor digitado e impar ");
        printf ("\n");
        printf ("\n================================");
    }
return 0;
}

