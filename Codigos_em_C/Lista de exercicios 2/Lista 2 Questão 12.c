#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int codigo;
    printf ("\n=============================================");
    printf ("\n");
    printf ("\n-> Informe o C�digo do Produto: ");
    scanf ("%d", &codigo);
    printf ("\n=================Descri��o===================");
    printf ("\n");
    switch (codigo){
        case 1:{
            printf ("\n-> CANETA = R$ 1,20.");
            break;
        }
        case 2:{
            printf ("\n-> L�PIS = R$ 0,80.");
            break;
        }
        case 3:{
            printf ("\n-> CADERNO = R$ 4,50.");
            break;
        }
        case 4:{
            printf ("\n-> BORRACHA = R$ 1,00.");
            break;
        }
        case 5:{
            printf ("\n-> R�GUA = R$ 1,50.");
            break;
        }
        default:{
            printf ("\n===================ERRO======================");
            printf ("\n");
            printf ("\n-> C�digo Inv�lido ou Inexistente \!");
            break;
        }
    }
    printf ("\n");
    printf ("\n=============================================");
return 0;
}
