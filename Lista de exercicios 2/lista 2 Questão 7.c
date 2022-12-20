#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float VSM,VS, I, T;
    int Q;
    printf ("====================================================");
    printf ("\n");
    printf ("\n-> Informe o Valor do Salário mínimo: ");
    scanf ("%f", &VSM);
    printf ("\n");
    printf ("\n====================================================");
    printf ("\n");
    printf ("\n-> Informe o Valor do Salário que ganha: ");
    scanf ("%f", &VS);
    printf ("\n====================================================");
    printf ("\n");
        Q = VS/VSM;
    printf ("\n-> Vc ganha %d Salários Mínimos", Q);
    printf ("\n");
    printf ("\n====================================================");
    printf ("\n");
        if (Q > 3){
            I = VS * 0.15;
            printf ("\n-> Você Deve Pagar o Imposto de Renda.");
            printf ("\n");
            printf ("\n-> Valor = R$ %.2f", I);
            printf ("\n");
            T = VS * (1 + 0.15);
            printf ("\n-> Valor Total = R$ %.2f", T);
            printf ("\n");
            printf ("\n====================================================");
        }
        else {
            printf ("\n-> Vc está insento de imposto.");
            printf ("\n");
            printf ("\n====================================================");
        }
return 0;
}
