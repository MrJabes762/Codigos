#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale(LC_ALL, "Portuguese");
  float n;
  printf("-> Informe um numero real: ");
  scanf ("%f", &n);
  printf("\n-> A Quinta parte desse numero é: %.1f", n * 0.2);
  return 0;
}