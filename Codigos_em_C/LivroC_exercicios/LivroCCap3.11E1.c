#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int inteiro;
  printf("Digite um número inteiro: ");
  scanf ("%d", &inteiro);
  printf("\n-> O Sucessor de %d é %d \n", inteiro, inteiro + 1);
  printf("-> O antecessor de %d é %d \n", inteiro, inteiro - 1);
  return 0;
}