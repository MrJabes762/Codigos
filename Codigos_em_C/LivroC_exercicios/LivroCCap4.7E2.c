#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  float A, B;
  printf ("-> Informe dois numeros: ");
  scanf ("%f%f", &A,&B);
    if (A > B){
        printf ("\n-> %.2f é maior que %.2f.",A ,B);
    } else if (B > A){
        printf ("\n-> %.2f é maior que %.2f.",B,A);
      } else if (A == B){
          printf ("\n-> Ambos os numeros são iguais.");
        }
  return 0;
}