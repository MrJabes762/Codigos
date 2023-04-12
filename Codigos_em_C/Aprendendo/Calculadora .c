#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main (void){
    setlocale (LC_ALL, "Portuguese");
    float A, B, C;
    char R;
        do {
            A = 0;
            B = 0;
            C = 0;
            system ("cls");
            int Operacao;
            Operacao = 0;
            printf ("\n============================================\n");
            printf ("\n               Calculadora                \n");
            printf ("\n============================================\n");
            printf ("\n 1 - Adição                  2 - Subtração\n");
            printf ("\n 3 - Mutiplicação            4 - Divisão  \n");
            printf ("\n============================================\n");
            printf ("\n-> Opção: ");
            scanf ("%d", &Operacao);
                switch (Operacao){
                    case 1:{
                        system ("cls");
                        printf ("\n============================================\n");
                        printf ("\n-> Digite os valores: \n");
                        scanf ("%f %f", &A, &B);
                            C = A + B;
                        printf ("\n-> %.2f + %.2f = %.2f \n", A , B , C);
                        printf ("\n============================================\n");
                        system ("pause");
                        system ("cls");
                        break;
                    }
                    case 2:{
                        system ("cls");
                        printf ("\n============================================\n");
                        printf ("\n-> Digite os valores: \n");
                        scanf ("%f %f", &A, &B);
                            C = A - B;
                        printf ("\n-> %.2f - %.2f = %.2f \n", A , B , C);
                        printf ("\n============================================\n");
                        system ("pause");
                        system ("cls");
                        break;
                    }
                    case 3:{
                        system ("cls");
                        printf ("\n============================================\n");
                        printf ("\n-> Digite os valores: \n");
                        scanf ("%f %f", &A, &B);
                            C = A * B;
                        printf ("\n-> %.2f x %.2f = %.2f \n", A , B , C);
                        printf ("\n============================================\n");
                        system ("pause");
                        system ("cls");
                        break;
                    }
                    case 4:{
                        system ("cls");
                        printf ("\n============================================\n");
                        printf ("\n-> Digite os valores: \n");
                        scanf ("%f %f", &A, &B);
                            C = A / B;
                        printf ("\n-> %.2f / %.2f = %.2f \n", A , B , C);
                        printf ("\n============================================\n");
                        system ("pause");
                        system ("cls");
                        break;
                    }
                    default:{
                        system ("cls");
                        printf ("\n============================================\n");
                        printf ("\n-> OPÇÃO INVÁLIDA.\n");
                        printf ("\n============================================\n");
                        system ("pause");
                        system ("cls");
                        break;
                    }
                }
            printf ("\n-> Deseja efetuar mais algum Cálculo? s/n \n");
            scanf ("%s", &R);
        }while (R == 's');
    system ("cls");
    system ("Pause");
return 0;
}
