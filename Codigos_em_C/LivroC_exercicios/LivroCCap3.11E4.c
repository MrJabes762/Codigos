#include <stdio.h>
#include <locale.h> 

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  float M,n1,n2,n3,n4;
  printf("-> Informe 4 números: \n");
  scanf ("%f %f %f %f", &n1,&n2,&n3,&n4);
  printf ("\n-> A média desses valores = %.1f", M = (n1 + n2 + n3 + n4)/4);
  return 0;
}