
#include <stdio.h>

int comparação (int dia,int mês,int ano, int D, int M, int A){
  int valor;
   if (dia == D && mês == M && ano == A){
     valor = 0;
     return valor;
    }else if (dia < D && mês < M && ano < A){
      valor = -1;
      return valor;
     } else if (dia > D && mês > M && ano > A){
       valor = 1;
        return valor;
      }
}
int main () {
  int M,A,B,C,D,E,F; 
  scanf ("%i-%i-%i-%i-%i-%i",&A,&B,&C,&D,&E,&F);
  M = comparação(A,B,C,D,E,F);
  printf ("Valor de retorno %d", M);
  return 0;
}