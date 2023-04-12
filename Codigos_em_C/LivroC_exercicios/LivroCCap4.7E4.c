#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Protuguese");
  float salario, prestação, I;
  printf ("-> Infome o seu salario: ");
  scanf ("%f", &salario);
  printf ("\n-> Informe a prestacão do empréstimo: ")
  ;
  scanf ("%f",&prestação);
    if ( prestação > (I = salario * 0.20) ){
      printf ("\n-> Emprestimo não concedido. ");
    } else {
        printf ("\n-> Emprestimo concedido. ");
    }
  return 0;
}