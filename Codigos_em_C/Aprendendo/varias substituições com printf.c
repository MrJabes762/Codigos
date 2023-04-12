#include <stdio.h>
#include <locale.h>

int main() {
  setlocale (LC_ALL, "Portuguese");
  int Iq = 1;
  float Sal = 1500.8;
  printf("Quantidade: %d\n", Iq);
  printf("Salário: %.2f", Sal);
  return 0;
}