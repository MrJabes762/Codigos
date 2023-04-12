#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

void main (){
    setlocale (LC_ALL, "portuguese");
    int  vetor[10], cont;
    printf ("\n==============================================\n");
    printf ("\n-> Informe 10 valores: \n");
    //leitura de dados
        for (cont = 0;cont < 10; cont++){
            scanf ("%d", &vetor[cont]);
        }
    printf ("\n==============================================\n");
    system ("cls");
    system ("pause");
    system ("cls");
    printf ("\n==============================================\n");
    printf ("\n-> Exibindo os 10 valores: \n");
    //exibir informações
        for (cont = 0;cont < 10; cont++){
            printf ("\n%d", vetor[cont]);
        }
    printf ("\n==============================================\n");
    system ("pause");
return 0;

}
