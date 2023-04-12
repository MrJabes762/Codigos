#include <stdio.h>
#include <locale.h>

int main () {
    float d, ct, cm;
    setlocale (LC_ALL, "Portuguese");
    printf ("===========================================");
    printf ("\n");
    printf ("\n -> Informe a distância total percorrida:");
    scanf ("%f", &d);
    printf ("\n");
    printf ("\n===========================================");
    printd ("\n");
    printf ("\n -> Informe o comsumo total: ");
    scanf ("%f", &ct);
        cm =  d/ct;
    printf ("\n");
    printf ("\n===========================================");
    printf ("\n");
    printf ("\n O consumo médio foi de: %.1f km/l", cm);
    printf ("\n");
    printf ("\n===========================================");
}
