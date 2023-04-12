#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  char letraM;
  int numasc;
  printf("-> Informe uma letra Maiuscula: ");
  scanf ("%c", &letraM);
    numasc = (int) letraM;
    numasc = numasc + 32;
  printf ("\n-> A Letra maiuscula %c, minuscula é %c. \n", letraM, numasc);
  return 0;
}