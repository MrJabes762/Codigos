#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        int Cont, par, Numero;
        par = 0;
        printf ("\n========================================================\n");
            for (Cont = 1; Cont <= 50; Cont++){
                printf ("\n-> Informe o %d número: ",Cont);
                scanf ("%d", &Numero);
                printf ("\n========================================================\n");
                    if ((Numero%2) == 0){
                        par++;
                    }
            }
        printf ("\n-> Dentre os números mensionados %d são pares.\n",par);
        printf ("\n========================================================\n");
    }
