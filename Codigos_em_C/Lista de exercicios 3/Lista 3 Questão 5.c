#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        int cont, T;
        printf ("\n=====================================================\n");
        printf ("\n-> Informe o valor que deseja saber a tabuada: ");
        scanf ("%d", &T);
        printf ("\n=====================================================\n");
            for (cont = 1; cont <= 10; cont++){
                printf ("\n -> %d + %d = %d", T, cont, T + cont);
            }
        printf ("\n");
        printf ("\n=====================================================\n");
        system ("pause");
        system ("cls");
    return 0;
    }
