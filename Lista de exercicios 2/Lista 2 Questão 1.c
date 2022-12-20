#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int Numero;
    printf ("=============================================");
    printf ("\n");
    printf ("\n-> Informe um número inteiro: ");
    scanf ("%d", &Numero);
    printf ("\n=============================================");
    printf ("\n");
        if (Numero % 3 == 0){
            printf ("\n-> O número informado é múltiplo de 3.");
        }
        else {
            printf ("\n-> O número informado não é múltiplo de 3.");
        }
    printf ("\n");
    printf ("\n=============================================");
return 0;
}
