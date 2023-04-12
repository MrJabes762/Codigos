#include <stdio.h>
//Crie um programa que leia do teclado seis valores inteiros e em seguida mostra na tela os valores lidos
int main(void) {
  int valores[6];

  printf("Informe 6 valores\n");
    for(int i = 0; i < 6; i++){
      scanf("%d", &valores[i]);
    }
  printf("Os valores informados foram: ");
      for(int i = 0; i < 6; i++){
        printf("%d ", valores[i]);
      }

  //----------------------------
  
  printf("Os valores informados foram: ");
  for(int i = 5; i >= 0; i--){
    printf("%d ", valores[i]);
  }
  
  printf("\n");

  int menor = valores[0]; 
  int maior = valores[0]; 
  int posicaoMaior = 0; 
  int posicaoMenor = 0; 
  for(int i = 1; i < 6; i++){
    if(maior < valores[i]){
      maior = valores[i];
      posicaoMaior = i;
    }    
    if(menor > valores[i]){
      menor = valores[i];
      posicaoMenor = i;
    } o   
  }

  printf("O maior numero digitado foi %d \n", maior);
  printf("O posicao do maior numero digitado foi %d \n", ++posicaoMaior);
  

  printf("O menor numero digitado foi %d \n", menor);
  printf("O posicao do menor numero digitado foi %d \n", ++posicaoMenor);
  

  int primeiro = 1; 
  int menor2; 
  int maior2; 
  int posicaoMaior2; 
  int posicaoMenor2; 
  for(int i = 0; i < 6; i++){
    int valorLido;
    scanf("%d", &valorLido);
    if (primeiro == 1){
      menor2 = valorLido;
      maior = valorLido;
      posicaoMaior2 = 0;
      posicaoMenor2 = 0; 
      primeiro= 0;
    }else{
      if(maior2 < valorLido){
        maior2 = valorLido;
        posicaoMaior2 = i;
      }    
      if(menor2 > valorLido){
        menor2 = valorLido;
        posicaoMenor2 = i;
      }    
    }
  }

  printf("O maior numero digitado foi %d \n", maior2);
  printf("O posicao do maior numero digitado foi %d \n", ++posicaoMaior2);
  

  printf("O menor numero digitado foi %d \n", menor2);
  printf("O posicao do menor numero digitado foi %d \n", ++posicaoMenor2);
  
  return 0;
}