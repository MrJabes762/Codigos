#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int Numero;
    printf ("=============================================");
    printf ("\n");
    printf ("\n-> Informe um n�mero inteiro: ");
    scanf ("%d", &Numero);
    printf ("\n=============================================");
    printf ("\n");
        if (Numero % 3 == 0){
            printf ("\n-> O n�mero informado � m�ltiplo de 3.");
        }
        else {
            printf ("\n-> O n�mero informado n�o � m�ltiplo de 3.");
        }
    printf ("\n");
    printf ("\n=============================================");
return 0;
}
