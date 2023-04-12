#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int N1, N;
    printf ("=====================================================\n");
    printf ("\n-> Informe um número inteiro: ");
    scanf ("%d", &N1);
    printf ("\n=====================================================\n");
        N = (((N1%100)%10) * 100) + (((N1%100)/10) * 10) + (N1/100);
    printf ("\n-> O Número %d invertido é: %d \n", N1, N);
    printf("\n=====================================================\n");
}
