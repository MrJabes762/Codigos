#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "portuguese");
    int Dia;
    printf ("\n=============================================");
    printf ("\n");
    printf ("\n-> Informe um n�mero inteiro de 1 a 7: ");
    scanf ("%d", &Dia);
    printf ("\n====================================================");
    printf ("\n");
        switch (Dia){
            case 1:{
                    printf ("\n-> O n�mero informado corresponde a Segunda - Feira.");
                    break;
                }
            case 2:{
                    printf ("\n-> O n�mero informado corresponde a Ter�a - Feira.");
                    break;
                }
            case 3:{
                    printf ("\n-> O n�mero informado corresponde a Quarta - Feira.");
                    break;
                }
            case 4:{
                    printf ("\n-> O n�mero informado corresponde a Quinta - Feira.");
                    break;
                }
            case 5:{
                    printf ("\n-> O n�mero informado corresponde a Sexta - Feira.");
                    break;
                }
            case 6:{
                    printf ("\n-> O n�mero informado corresponde a Sabado.");
                    break;
                }
            case 7:{
                    printf ("\n-> O n�mero informado corresponde a Domingo.");
                    break;
                }
            default:{
                    printf ("\n-> O n�mero inv�lido. Tente novamente ");
                    break;
                }
        }
    printf ("\n");
    printf ("\n====================================================");
return 0;
}
