#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float N1, N2;
    printf ("===============================================================");
    printf ("\n");
    printf ("\n-> Informe 2 Números: ");
    scanf ("%f %f", &N1, &N2);
    printf ("\n===============================================================\n");
        if (N1 < N2){
            printf ("\n-> %f é menor que %f. ", N1, N2);
        }else if (N1 > N2){
            printf ("\n-> %f é maior que %f.", N1, N2);
        }else {
            printf ("\n-> Ambos são iguais.");
        }
    printf ("\n");
    printf ("\n===============================================================");
return 0;
}
