#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        int Numero,A, S;
        Numero = 0;
        S = 0;
            for (A = 1; A <= 50; A++){
                printf ("\n=============================================\n");
                printf ("\n -> Informe o %d º número: ", A);
                scanf ("%d", &Numero);
                    S = S + Numero;
            }
        printf ("\n=============================================\n");
        printf ("\n-> Somatória total = %d \n", S);
        printf ("\n=============================================\n");
        system ("pause");
        system ("cls");
        system ("pause");
    return 0;
    }
