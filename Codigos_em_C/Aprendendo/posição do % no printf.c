#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL,"Portuguese");
  int qtd = 10;
  printf("Total = %d\n", qtd);
  printf("%d caixas\n", qtd);
  printf("Total de %d caixas \n", qtd);
  return 0;
}