#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  char letra = 'B';
  printf("O valor de letra é %c. \n", letra);
  return 0;
}