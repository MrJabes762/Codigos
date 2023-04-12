#include <stdio.h>

int main(void) {
  char A[10],B[10],valor,aux;
  int C;
  printf ("\nInforme o vetor A:\n");
    for (C = 1;C <= 10;C++){
      scanf ("%s",&valor);
      A [C] = valor;
    }
  printf ("\nInforme o vetor B:\n");
    for (C = 1;C <= 10;C++){
      scanf ("%s",&valor);
      B [C] = valor;
    }
  printf("\n========================================");
  printf ("\nVetores Antes da troca: ");
  printf ("\nVetor A: \n");
    for (C = 1;C < 11;C++){
      printf (" %c \n", A[C]);
    }
  printf ("\nVetor B: ");
    for (C = 1;C < 11;C++){
      printf (" %c \n", B[C]);
    }
  printf ("========================================");
  printf ("\nTroca de valores: ");
  printf ("\nVetor A:\n ");
    for (C = 1;C < 11;C++){
      aux = A[C];
      A[C] = B[11-C];
      B[11-C] = aux;
      printf (" %c \n", A[C]);
    }
    printf ("\nVetor B: ");
    for (C = 1;C < 11;C++){
      printf (" %c \n", B[C]);
    }
  return 0;
}