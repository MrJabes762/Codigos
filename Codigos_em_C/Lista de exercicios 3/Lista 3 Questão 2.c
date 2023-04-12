#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        int cont;
        float numero, M, S;
        S = 0;
        numero = 0;
        M = 0;
        printf ("\n==========================================\n");
            for (cont = 1;cont <= 10; cont++){
                printf ("\n-> Informe o %d º número: ", cont);
                scanf ("%f", &numero);
                printf ("\n==========================================\n");
                    S = S + numero;
            }
        printf ("\n -> Somatória Total = %.2f\n", S);
        printf ("\n -> Media total = %.2f\n", M = S/10);
        printf ("\n==========================================\n");
        system ("pause");
    return 0;
    }
