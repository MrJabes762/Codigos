#include <stdio.h>
#include <stdlib.h>
#include <locale.h> 

struct variável {
  float num, num2, S;
};

float dentrodafunção (struct variável *B){
    ((*B).S) = ((*B).num) + ((*B).num2);
    return ((*B).S);
}
void função_parametro (struct variável A){
  float A1,A2,A3;
  A1 = A.num;
  A2 = A.num2;
  A3 = A1 + A2;
  printf ("\n->O resultado com a função por parâmetro é: %.2f",A3);
}
int main (){
    struct variável estrutura;
    setlocale (LC_ALL, "Portuguese");
    printf ("Informe 2 numeros:  ");
    scanf ("%f%f", &estrutura.num,&estrutura.num2);
    dentrodafunção (&estrutura);
    função_parametro (estrutura);
    printf ("\n->O resultado com a função por referencia é: %.2f",estrutura.S);
    return 0;
}