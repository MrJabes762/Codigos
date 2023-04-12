#include <stdio.h>

int main(void) {
  char sexo; 
  float A, H, M;
  printf("-> Informe o sexo:");
  scanf ("%s",&sexo);
  printf("\n-> Informe a altura: ");
  scanf ("%f", &A);
    if (sexo == 'h'){
      H = (72.7 * A) - 58;
      printf ("\nO Peso ideal é %f", H);
    }else if (sexo == 'm') {
       M = (62.1 * A) - 44.7;
       printf ("\nO peso ideal é %f", M);
    }
  return 0;
}