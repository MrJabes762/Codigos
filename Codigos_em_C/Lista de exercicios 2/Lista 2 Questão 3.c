#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float Numero;
    printf ("===============================================================");
    printf ("\n");
    printf ("\n-> Informe um N�mero: ");
    scanf ("%f", &Numero);
    printf ("\n===============================================================\n");
    printf ("\n");
        if (Numero > 20){
            printf ("-> O N�mero informado � maior que 20.");
        }else if (Numero < 20){
            printf ("-> O N�mero Informado � menor que 20.");
        }else {
            printf ("-> O N�mero Informado � igual a 20.");
        }
    printf ("\n");
    printf ("\n===============================================================");
return 0;
}
