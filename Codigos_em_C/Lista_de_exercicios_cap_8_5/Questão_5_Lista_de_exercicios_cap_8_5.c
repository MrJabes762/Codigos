/*5) Usando a estrutura Retângulo do exercício anterior, faça um programa que declare
e leia uma estrutura Retângulo e um Ponto, e informe se esse ponto está ou não
dentro do retângulo.*/ 
#include <stdio.h>

struct retangulo{
  int px1,py1,px2,py2;
};
int main(void) {
  int Ax,Ay;
  struct retangulo ponto;
  printf ("\n-> Informe as cordenadas dos pontos p1 (superior esquerdo) e p2 (inferior direito) do retangulo : \n\n-> Ponto 1 (X,Y): ");
  scanf ("%d%d", &ponto.px1,&ponto.py1);
  printf ("\n-> Ponto 2 (X,Y): ");
  scanf ("%d%d",&ponto.px2,&ponto.py2);
  printf ("\n-> Informe as cordenadas de um ponto qualquer: ");
  scanf ("%d%d", &Ax,&Ay);
    if (((Ax < ponto.px2) && (Ax > ponto.px1)) && ((Ay < ponto.py1) &&(Ay > ponto.py2))){
      printf ("\n-> O ponto informado (%d,%d) está dentro do retângulo.", Ax,Ay);
    }else{
      printf ("\n-> O ponto informado (%d,%d) não está dentro do retângulo.", Ax,Ay);
    }

  return 0;
}