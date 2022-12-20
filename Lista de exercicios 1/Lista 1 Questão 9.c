#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    char Cp[15];
    int Q;
    float Vu,Vt;

    printf ("=====================================================");
    printf ("\n");
    printf ("\n-> Informe o código do produto: ");
    scanf ("%s", &Cp);
    printf ("\n=====================================================");
    printf ("\n");
    printf ("\n-> Informe a Quantidade do produto em estoque: ");
    scanf ("%d", &Q);
    printf ("\n=====================================================");
    printf ("\n");
    printf ("\n-> Informe o valor unitário do produto:");
    scanf ("%f", &Vu);
    printf ("\n=====================================================");
    printf ("\n");
        Vt = (Q * Vu);
    printf ("\n-> Descrição: %s", Cp);
    printf ("\n");
    printf ("\n-> Valor total em estoque: R$ %.2f", Vt);
    printf ("\n");
    printf ("\n=====================================================");
}
