#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int Vc;
    float P;
    printf ("=========================================================");
    printf ("\n");
    printf ("\n           Loja compra que eu enriqueço                \n");
    printf ("\n");
    printf ("=========================================================");
    printf ("\n");
    printf ("\n -> Informe o valor da compra: ");
    scanf ("%d", &Vc);
    printf ("\n");
    printf ("=========================================================");
    printf ("\n");
            P =  Vc/5;
    printf ("\n-> Sua compra será dividida em 5 prestações de: R$ %.2f \n", P);
    printf ("\n");
    printf ("=========================================================");
}
