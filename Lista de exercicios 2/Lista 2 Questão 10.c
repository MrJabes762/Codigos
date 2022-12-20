#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float L1, L2, L3;
    printf ("\n=============================================");
    printf ("\n");
    printf ("\n-> Informe os 3 Lados do Triângulo: ");
    scanf ("%f %f %f", &L1, &L2, &L3);
    printf ("\n=============================================");
    printf ("\n");
        if ((L1 > (L2 - L3)) && (L1 < (L2 + L3)) && (L2 > (L1 - L3)) && (L2 < (L1 + L3)) && (L3 > (L1 - L2)) && (L3 < (L1 + L2))) {
            printf ("\n-> De acordo com a condição de existência. \n");
            printf ("\n-> Os lados informados formam um triângulo. \n");
            printf ("\n-> Tipo: ");
                if ((L1 != L2) && (L1 != L3) && (L2 != L1) && (L2 != L3) && (L3 != L1) && (L3 != L2)){
                    printf (" ESCALENO.\n");
                    printf ("\n=============================================\n");
                }
                else if (L1 = L2 = L3) {
                    printf (" EQUILÁTERO.\n");
                    printf ("\n=============================================\n");
                }
                else {
                    printf (" ISÓCELES.\n");
                    printf ("\n=============================================\n");
                }
        }
        else {
            printf ("\n-> De acordo com a condição de existência. \n");
            printf ("\n-> Os lados informados não formam um triângulo. \n");
        }
    return 0;
}























