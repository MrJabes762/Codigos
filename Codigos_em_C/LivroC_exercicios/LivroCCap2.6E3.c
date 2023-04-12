#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL,"Portuguese");
  int n;
  scanf ("%d", &n);
  printf("-> Valor Lido: %d\n", n);
  return 0;
}