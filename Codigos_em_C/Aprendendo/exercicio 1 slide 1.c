#include <stdio.h>
#include <locale.h>

int main ()
{
    setlocale (LC_ALL, "Portuguese");
    int matricula, idade;
    float salario;
    char sexo;

    printf ("\nDigite a matr�cula: ");
    scanf ("%d", &matricula);
    printf ("Digite a idade: ");
    scanf ("%d", &idade);
    printf ("Digite o sal�rio: ");
    scanf ("%f", &salario);
    fflush (stdin);
    printf ("Digite o sexo");
    scanf ("%c", &sexo);

    printf ("\n====== R�latorio ======\n");
    printf ("Matr�cula: %d - Idade: %d", matricula,idade);
    printf ("\nSal�rio: %f", salario);
    printf ("\nSexo: %c", sexo);
}
