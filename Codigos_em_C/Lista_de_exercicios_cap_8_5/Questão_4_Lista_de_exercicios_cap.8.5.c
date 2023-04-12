/*4) Crie uma estrutura chamada Retângulo. Essa estrutura deverá conter o ponto
superior esquerdo e o ponto inferior direito do retângulo. Cada ponto é definido
por uma estrutura Ponto, a qual contém as posições X e Y. Faça um programa que
declare e leia uma estrutura Retângulo e exiba a área e o comprimento da diagonal
e o perímetro desse retângulo.*/
#include <stdio.h>
#include <math.h> 

struct retangulo{
  int px1,py1,px2,py2;
};
int main(void) {
  float A, D, P;
  struct retangulo ponto;
  printf ("\n-> Informe as cordenadas dos pontos p1 (superior esquerdo) e p2 (inferior direito) do retangulo : \n\n-> Ponto 1 (X,Y): ");
  scanf ("%d%d", &ponto.px1,&ponto.py1);
  printf ("\n-> Ponto 2 (X,Y): ");
  scanf ("%d%d",&ponto.px2,&ponto.py2);
    D = sqrt (pow((ponto.px2 - ponto.px1),2) + pow ((ponto.py2 - ponto.py1),2));
    A = (ponto.py1 - ponto.py2) * (ponto.px2 - ponto.px1);
    P = (2 * (ponto.px2 - ponto.px1)) + (2*(ponto.py1 - ponto.py2));
      if (A < 0){
        A = A * (-1);
      }
      if (P < 0){
        P = P *(-1);
      }
    printf ("\n-> Com base nos pontos informados...\n");
    printf ("-> A Área do retângulo mede: %.2f", A);
    printf ("\n-> A Diagonado do retângulo mede: %.2f", D);
    printf ("\n-> O perímetro do retângulo = %.2f", P);
    
  return 0;
}