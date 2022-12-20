#include <stdio.h>
#include <locale.h>

void escolha(){
    switch (codigo){
            case 1:{
                printf ("\n                    ESCRITURÁRIO                   ");
                printf ("\n");
                printf ("\n===================================================");
                printf ("\n");
                printf ("\n-> REAJUSTE SALARIAL DE 50% ");
                printf ("\n");
                reajuste = salario * (1 + 0.50);
                printf ("\n-> Salário Reajustado R$ %.2f", reajuste);
                break;
            }
            case 2:{
                printf ("\n                    SECRETÁRIO                     ");
                printf ("\n");
                printf ("\n===================================================");
                printf ("\n");
                printf ("\n-> REAJUSTE SALARIAL DE 30%.");
                printf ("\n");
                reajuste = salario * (1 + 0.30);
                printf ("\n-> Salário Reajustado R$ %.2f", reajuste);
                break;
            }
            case 3: {
                printf ("\n                      CAIXA                        ");
                printf ("\n");
                printf ("\n===================================================");
                printf ("\n");
                printf ("\n-> REAJUSTE SALARIAL DE 20%.");
                printf ("\n");
                reajuste = salario * (1 + 0.20);
                printf ("\n-> Salário Reajustado R$ %.2f", reajuste);
                break;
            }
            case 4:{
                printf ("\n                     GERENTE                       ");
                printf ("\n");
                printf ("\n===================================================");
                printf ("\n");
                printf ("\n-> REAJUSTE SALARIAL DE 10%.");
                printf ("\n");
                reajuste = salario * (1 + 0.10);
                printf ("\n-> Salário Reajustado R$ %.2f", reajuste);
                break;
            }
            case 5:{
                printf ("\n                     DIRETOR                       ");
                printf ("\n");
                printf ("\n===================================================");
                printf ("\n");
                printf ("\n-> NÃO POSSUI AUMENTO.");
                break;
            }
            default:{
                printf ("\n");
                printf ("-> CÓDIGO INVÁLIDO/INEXISTENTE. ");
                break;
            }
        }
}
int main (){
    setlocale (LC_ALL, "Portuguese");
    float salario, reajuste;
    int codigo;
    printf ("===================================================");
    printf ("\n");
    printf ("\n-> Informe o Salário: ");
    scanf ("%f", &salario);
    printf ("\n===================================================");
    printf ("\n");
    printf ("\n-> Em seguida o código referente ao seu cargo: ");
    scanf ("%d", &codigo);
    printf ("\n===================================================");
    printf ("\n");
        escolha();
    printf ("\n");
    printf ("\n===================================================");
return 0;
}
