#include <stdio.h>


int main(void) {
  float número,media,Soma,Somai;
  int n[10],c,p1,contp;

    for (c = 1;c <= 10;c++){
      printf ("Digite um numero: ");
      scanf ("%f",&número);
      n[c] = número;
        if (n[c] % 2 == 0){
          Soma = Soma + número;
          contp ++;
        }else if (n[c] % 2 != 0){
          Somai = Somai + número;
        }
    }
  media = Soma/contp;
  printf ("A média dos numeros pares = %.2f", media);
  printf ("\nA soma dos numeros impares = %.2f",Somai);
  return 0;
}