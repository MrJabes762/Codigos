#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale (LC_ALL,"Portuguese");
  char letra;
  printf("-> Informe uma Letra: ");
  scanf ("%c",&letra);
    if (letra == 'A'){
      printf ("\n-> A");
    }
  return 0;
}