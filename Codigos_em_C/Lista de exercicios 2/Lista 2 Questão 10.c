#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float L1, L2, L3;
    printf ("\n=============================================");
    printf ("\n");
    printf ("\n-> Informe os 3 Lados do Tri�ngulo: ");
    scanf ("%f %f %f", &L1, &L2, &L3);
    printf ("\n=============================================");
    printf ("\n");
        if ((L1 > (L2 - L3)) && (L1 < (L2 + L3)) && (L2 > (L1 - L3)) && (L2 < (L1 + L3)) && (L3 > (L1 - L2)) && (L3 < (L1 + L2))) {
            printf ("\n-> De acordo com a condi��o de exist�ncia. \n");
            printf ("\n-> Os lados informados formam um tri�ngulo. \n");
            printf ("\n-> Tipo: ");
                if ((L1 != L2) && (L1 != L3) && (L2 != L1) && (L2 != L3) && (L3 != L1) && (L3 != L2)){
                    printf (" ESCALENO.\n");
                    printf ("\n=============================================\n");
                }
                else if (L1 = L2 = L3) {
                    printf (" EQUIL�TERO.\n");
                    printf ("\n=============================================\n");
                }
                else {
                    printf (" IS�CELES.\n");
                    printf ("\n=============================================\n");
                }
        }
        else {
            printf ("\n-> De acordo com a condi��o de exist�ncia. \n");
            printf ("\n-> Os lados informados n�o formam um tri�ngulo. \n");
        }
    return 0;
}























