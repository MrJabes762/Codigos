#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float Numero;
    printf ("===============================================================");
    printf ("\n");
    printf ("\n-> Informe um Número: ");
    scanf ("%f", &Numero);
    printf ("\n===============================================================\n");
    printf ("\n");
        if (Numero > 20){
            printf ("-> O Número informado é maior que 20.");
        }else if (Numero < 20){
            printf ("-> O Número Informado é menor que 20.");
        }else {
            printf ("-> O Número Informado é igual a 20.");
        }
    printf ("\n");
    printf ("\n===============================================================");
return 0;
}
