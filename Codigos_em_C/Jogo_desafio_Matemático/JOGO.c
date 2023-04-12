#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

/*
Esse é um jogo matemático, no qual o computador sorteia alguns numeros e pergunta qual a soma dos numeros, Se o jogador acerta a questão, ele avança de fase e vai somando pontos para o rank,
opções do jogo

- Criar novo jogo
- Carregar jogo antigo *permite o avanço na pontuação do jogador
- Exibir Rank *Permite verificar a classificação dos 10 melhores jogadores.

Para efeito de teste use a sequencia >1>1 para iniciar o jogo!

*/

int main() {
 
 int sel, n1,n2, result, loop = 1,jog,escl,cont,rodada=1,resultc;
 
 while(loop == 1) {
   rodada=1;
   system("clear");
   printf("_____________________________________\n");
   printf("------ JOGO DA SOMA MATEMÁTICA ------\n");
   printf("_____________________________________\n");   
   printf("---------< MENU PRINCIPAL >----------\n");
   printf("\n 1 - CONTINUAR JOGO \n 2 - CRIAR NOVO JOGO\n 3 - EXIBIR RANK\n 5 - SAIR\n");
   printf("\n> Opção:");
   scanf("%d%*c",&sel);

   switch (sel) {
// inicia jogo e escolhe jogador
  // Menu 1 
     // Opção jogar - JOGO concluido - falta - (sel jogador) 
     case 1:

      system("clear");
      printf("______________________________________\n");
      printf("------- JOGO DA SOMA MATEMÁTICA ------\n");
      printf("______________________________________\n");   
      printf("---------< MENU DE SELEÇÃO >----------\n");
      printf("\n> Escolha o seu jogo: \n");
      printf("\n 1 - KAS \n 2 - LUC \n 3 - DEB \n 4 - PH \n");
      printf("\n Opção:");

      scanf("%d%*c",&escl);

      if(escl < 1 && escl >10)
      cont=0;
        
    while(rodada == 1){

     system("clear");
     
      cont++;

      n1 = (rand() % 31);
      n2 = (rand() % 31);

      resultc = n1 + n2;
      printf("______________________________________\n");
      printf("------- JOGO DA SOMA MATEMÁTICA ------\n");
      printf("______________________________________\n");   
      printf("             < RODADA %d >            \n",cont);
      printf("\n Quanto é %d + %d?\n\n> R: ",n1,n2);

      scanf("%d%*c",&result);

      if(result == resultc){
      printf("\n------ Parabéns! Você acertou! ------\n");
      printf("            < %d + %d = %d >          \n",n1,n2,resultc);
      printf("\n   Pressione ENTER para continuar...\n");
       getchar();
      }
      else{
      printf("\n------- Que pena! Você errou! -------\n");
      printf("            < %d + %d = %d >          \n",n1,n2,resultc);
     
      cont=0;
      rodada=0;
      }
    }
     break;
       // Opção sair - Concluida
      case 5:
      system("clear");
      printf("______________________________________\n");
      printf("------- JOGO DA SOMA MATEMÁTICA ------\n");
      printf("--------------------------------------\n"); 
      printf("     Você  escolheu sair do jogo        \n\n");
      loop=0;
     break;
   }

     printf("\n   Pressione ENTER para continuar...\n");
      getchar();
 }
}