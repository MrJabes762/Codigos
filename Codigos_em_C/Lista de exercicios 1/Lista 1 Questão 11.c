#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int N1, N;
    printf ("=====================================================");
    printf ("\n");
    printf ("\n-> Informe um n�mero inteiro: ");
    scanf ("%d", &N1);
    printf ("\n=====================================================");
    printf ("\n");
        N = (((N1%100)%10) * 100) + (((N1%100)/10) * 10) + (N1/100);
    printf ("\n-> O N�mero %d invertido �: %d", N1, N);
    printf ("\n");
    printf ("\n=====================================================");
}
