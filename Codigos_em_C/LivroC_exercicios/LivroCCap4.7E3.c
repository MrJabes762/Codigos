#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Protuguese");
  int n1;
  printf("-> Infome o número: ");
  scanf ("%d", &n1);
    if (n1 % 2 == 0){
      printf ("\n-> O numero informado é par.");
    } else {
        printf ("\n-> O numero informado é impar.");
    }
  return 0;
}