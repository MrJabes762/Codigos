#include <stdio.h>
#include <string.h>
/*
Uma empresa vende o mesmo produto para quatro diferentes estados. 
Cada estado possui uma taxa diferente de imposto sobre o produto. 
Faça um programa em que o usuário entre com o valor e o estado de destino do produto e o programa retorne o preço final do produto acrescido do imposto do estado em que ele será vendido. Se o estado digitado não for válido, mostrará uma mensagem de erro. Estado |MG |SP |RJ | MS
Imposto | 7% |12% |15% | 8% 
*/

int main(void) {
  char estado[2];
  float valor;
  printf("Informe o valor do produto\n");
  scanf("%f", &valor);
  printf("Informe o estado de destino (A - MG | B - SP | C - RJ | D - MS)\n");
  scanf("%s", estado);
  
  if(strcmp(estado,"MG") != 0 && strcmp(estado,"SP")!= 0 && strcmp(estado,"RJ")!= 0 && strcmp(estado,"MS")!= 0){
    printf("Estado nao encontrado");
  }else{
    if(strcmp(estado,"MG")== 0){
        valor+= valor*0.07;
        printf("O estado escolhido foi MG e o valor do produto ficou em :%.2f", valor);
    }else{
      if(strcmp(estado,"SP")== 0){
        valor+= valor*0.12;
        printf("O estado escolhido foi SP e o valor do produto ficou em :%.2f", valor);
      }else{
        if(strcmp(estado,"RJ")== 0){
          valor+= valor*0.15;
          printf("O estado escolhido foi RJ e o valor do produto ficou em :%.2f", valor);
        }else{
          if(strcmp(estado,"MS")== 0){
            valor+= valor*0.08;
            printf("O estado escolhido foi MS e o valor do produto ficou em :%.2f", valor);
          }
        }  
      }
    }
  }
  return 0;
}