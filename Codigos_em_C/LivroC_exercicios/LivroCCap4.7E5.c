#include <stdio.h>
#include <locale.h>
#include <math.h> 

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int A,Q;
  double R;
  printf ("-> Informe um número: ");
  scanf ("%i", &A);
    if (A >= 0){
      Q = pow (A,2);
      R = sqrt (A);
      printf ("\n-> O Número informado ao quadrado = %i.\n", Q);
      printf ("-> A raiz quadrada do numero digitado = %.2f. ",R);
    }
  return 0;
}