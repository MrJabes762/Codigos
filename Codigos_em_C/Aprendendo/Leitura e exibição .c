#include <stdio.h>
#include <locale.h>
int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int idade;
  char Nome;
  printf("Digite seu nome: ")
  printf("Digite sua idade: ");
  scanf ("%d", &idade);
  printf ("Sua idade é %d anos.\n", idade);
  return 0;
}