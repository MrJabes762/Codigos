#include <stdio.h>
#include <locale.h>

int main ()
{
    setlocale (LC_ALL, "Portuguese");
    int matricula, idade;
    float salario;
    char sexo;

    printf ("\nDigite a matrícula: ");
    scanf ("%d", &matricula);
    printf ("Digite a idade: ");
    scanf ("%d", &idade);
    printf ("Digite o salário: ");
    scanf ("%f", &salario);
    fflush (stdin);
    printf ("Digite o sexo");
    scanf ("%c", &sexo);

    printf ("\n====== Rélatorio ======\n");
    printf ("Matrícula: %d - Idade: %d", matricula,idade);
    printf ("\nSalário: %f", salario);
    printf ("\nSexo: %c", sexo);
}
