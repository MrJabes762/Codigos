#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL,"Portuguese");
  int N;
  printf("-> Digite um Número inteiro: ");
  scanf ("%d \n", &N);
  printf("-> O número informado é: %f ", N);
  return 0;
} 
 //R= deu erro porque as variaveis são de tipos diferentes, de modo que, ao colocar o %f que representam os numeros decimáis não há o recunhecimento do formato.