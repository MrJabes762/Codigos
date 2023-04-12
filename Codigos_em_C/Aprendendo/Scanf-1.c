#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int dia,mês,ano;
  printf("-> Informe a data (dia/mês/ano): ");
  scanf("%d %d %d", &dia,&mês,&ano);
  printf ("A data é: %d / %d / %d. ", dia,mês,ano);
  return 0;
}