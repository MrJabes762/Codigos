#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale(LC_ALL, "portuguese");
  int a,b,e;
  printf("-> Informe 3 numeros inteiros: ");
  scanf ("%d %d %d", &a, &b, &e);
  printf("\n-> A Soma desses numeros é igual a %d\n",a + b + e);
  return 0;
}