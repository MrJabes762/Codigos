#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    char Nome[20];
    float Salario;
    int Idade;
    printf ("=============================================");
    printf ("\n");
    printf ("\n                 Cadastro              ");
    printf ("\n");
    printf ("=============================================");
    printf ("\n");
    printf ("\n-> Informe o nome, salário e idade: ");
    scanf ("%s %f %d", &Nome, &Salario, &Idade);
    printf ("\n");
    printf ("\n===========================================");
    printf ("\n");
        if ((Idade > 18) && (Salario > 1000)){
            printf ("\n-> A pessoa pode se cadastrada \!");
        }
        else {
            printf ("\n-> A pessoa não pode ser cadastrada.");
        }
    printf ("\n");
    printf ("\n=============================================");
return 0;
}
