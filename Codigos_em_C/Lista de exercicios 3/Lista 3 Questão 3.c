#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

    void main (){
        int R;
        setlocale (LC_ALL, "portuguese");
        printf ("\n===============================================\n");
        printf ("\n-> Números entre 1 e 100.\n ");
            for (R = 2;R < 100; R++){
                printf ("%d \n", R);
            }
        printf ("\n===============================================\n");
        system ("pause");
    return 0;
    }
