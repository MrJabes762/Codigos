#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float N1,N2,N3,MP;
    printf ("===============================================================");
    printf ("\n");
    printf ("\n-> Informe as 3 notas adiquiridas: ");
    scanf ("%f %f %f", &N1, &N2, &N3);
    printf ("\n===============================================================");
    printf ("\n");
    MP = (N1 * 1 + N2 * 1 + N3 * 2)/4;
    printf ("\n-> A m�dia ponderada das 3 notas �: %.1f", MP);
    printf ("\n");
    printf ("\n===============================================================");
}
