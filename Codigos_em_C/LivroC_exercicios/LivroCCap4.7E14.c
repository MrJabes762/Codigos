#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Protuguese");
  int n1,n2;
  printf("-> Infome o número: ");
  scanf ("%d", &n1);
    if (n1 % 3 == 0){
      printf ("\n-> O numero informado é divisivel por 3.");
    } else if (n1 % 5 == 0){
        printf ("\n-> O numero informado é divisivel por 5.");
    }
  return 0;
}