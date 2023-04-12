#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Protuguese");
  float n1,n2;
  printf("-> Infome 2 números: ");
  scanf ("%f%f", &n1, &n2);
    if (n1 > n2){
      printf ("\n-> %.2f é maior que %.2f.", n1,n2);
    } else {
        printf ("\n-> %.2f é maior que %.2f.", n2,n1);
    }
  return 0;
}