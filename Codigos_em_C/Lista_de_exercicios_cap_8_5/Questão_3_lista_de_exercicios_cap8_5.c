/*3) Crie uma estrutura para representar as coordenadas de um ponto no plano (posi¬ções X e Y). Em seguida, declare e leia do teclado dois pontos e exiba a distância entre eles.*/
#include <stdio.h>
#include <math.h> 

struct cordenadas{
  int x , Y;
};
int main(void) {
  float D;
  int x1,y1; 
  struct cordenadas plano;
  printf ("\n-> Informe as cordenadas X e Y: ");
  scanf ("%d%d",&x1, &y1);
  plano.x = 1;
  plano.Y = 2;
  D = sqrt (pow ((plano.x -x1),2) + pow ((plano.Y - y1),2));
  printf ("\n-> A distancia do ponto (%d,%d) até o ponto (%d,%d) = %.2f", x1,y1, plano.x,plano.Y,D);
  return 0;
}