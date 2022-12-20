#include <stdio.h>
#include <locale.h>

int main (){

    float vc, icms;
    printf ("Informe o valor da compra: ");
    scanf ("%f", &vc);
    icms = vc * 0.12;
    printf ("\nO valor do icms: %.2f ", icms);
}
