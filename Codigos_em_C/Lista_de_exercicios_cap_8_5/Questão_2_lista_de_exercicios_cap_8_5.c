/*2) Crie uma estrutura para representar as coordenadas de um ponto no plano (posições
X e Y). Em seguida, declare e leia do teclado um ponto e exiba a distância
dele até a origem das coordenadas, isto é, a posição (0,0).*/
#include <stdio.h>
#include <math.h> 

struct cordenadas{
  int x, Y;
};
int main(void) {
  float D;
  struct cordenadas plano;
  printf ("\n-> Informe as cordenadas X e Y: ");
  scanf ("%d%d",&plano.x, &plano.Y);
  D = sqrt (pow ((plano.x -0),2) + pow ((plano.Y - 0),2));
  printf ("\n-> A distancia do ponto (%d,%d) á origem é = %.2f", plano.x,plano.Y,D);
  return 0;
}