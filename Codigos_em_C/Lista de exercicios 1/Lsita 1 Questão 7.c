#include <stdio.h>
#include <locale.h>

int main (){
    int D;
    float S;
    setlocale (LC_ALL, "Portuguese");
    printf ("\n=====================================================");
    printf ("\n");
    printf ("\n-> Informe o N�mero de dias Trabalhados: ");
    scanf ("%d", &D);
    printf ("\n");
    printf ("=====================================================");
    printf ("\n");
        S = 30 * D * (1 - 0.08);
    printf ("\n-> Sal�rio liquido = R$ %.2f ", S);
    printf ("\n");
    printf ("\n=====================================================");
}
