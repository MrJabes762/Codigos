#include <stdio.h>
#include <stdlib.h>
struct testeEST{
  char nome[20];
  int fase;
  float pontos;

};
char nomeArquivo[20] = "DadosJogo.txt";

void salvaJogo(struct testeEST dados){
    FILE *arq;  
    int result;
    arq = fopen(nomeArquivo,"a");
    if(arq == NULL) {
        printf("Problemas na ABERTURA do arquivo\n");
        exit(1);
    }
  result = fprintf(arq,"%s\n%d\n%f\n",dados.nome,dados.fase,dados.pontos);
  if(result < 0)
  printf("Erro na escrita\n");
  fclose(arq);  
}
 
struct testeEST recuperaJogo(){
  struct testeEST dados;

  FILE *arq;  
  int result;
  arq = fopen(nomeArquivo,"r");
  if(arq == NULL) {
      printf("Problemas na ABERTURA do arquivo\n");
      exit(1);
  }

  fscanf(arq,"%s",dados.nome);
  fscanf(arq,"%d",&dados.fase);
  fscanf(arq,"%f",&dados.pontos);
  fclose(arq);
  return dados;
 };


int main(){


  struct testeEST dados;
  printf("Informe o nome do jogador\n");
  scanf(" %s", dados.nome);

  printf("Informe a fase\n");
  scanf("%d", &dados.fase);

  printf("Informe a pontuação\n");
  scanf("%f", &dados.pontos);


  salvaJogo(dados);
  //...
  struct testeEST dados2;
  dados2  = recuperaJogo();
{
  FILE *arq;
  char c;
      
  arq = fopen(nomeArquivo,"r");
  if (arq == NULL)
  {
    printf("Erro ao tentar abrir o arquivo!");
    exit(1);
  }
  printf("Lendo e exibindo os dados do arquivo \n\n");

  do
  { 
      c = fgetc(arq);
      printf("%c" , c);        
  }while (c != EOF);//enquanto não for final de arquivo 
    fclose(arq);//fechando o arquivo
  return(0);
}

 return 0;
}
/*void exibirank (){
      
      int i=0,x,auxp;
      char auxn[20],teste;
       //---------- Usuários para teste ----------
      usuario[10].ponto = 5;
      strcpy( usuario[10].nome,"Charles");
    
      usuario[11].ponto = 4;
      strcpy( usuario[11].nome,"Luana");

      usuario[12].ponto = 20;
      strcpy( usuario[12].nome,"João");

      usuario[13].ponto = 30;
      strcpy( usuario[13].nome,"Maria");

      usuario[14].ponto = 56;
      strcpy( usuario[14].nome,"Lucas");

      usuario[15].ponto = 1;
      strcpy( usuario[15].nome,"Angelina");

      usuario[16].ponto = 25;
      strcpy( usuario[16].nome,"Davi");

      usuario[17].ponto = 59;
      strcpy( usuario[17].nome,"Pedro");

      usuario[18].ponto = 56;
      strcpy( usuario[18].nome,"Jabes");

      usuario[19].ponto = 57;
      strcpy( usuario[19].nome,"Ana");
   //-------------------------------------------
     
      // struct cadastro rank[qtd];

      menudojogo ();
      printf("-------------< TOP 10 >--------------\n");

       for(i=0;i<qtd;i++){
         rank[i].ponto = usuario[i].ponto;
         strcpy(rank[i].nome,usuario[i].nome);
        }

       for(i=0;i<qtd;i++){
         for(x=i+1;x<qtd;x++){
           if(rank[i].ponto<rank[x].ponto){

             strcpy(auxn,rank[i].nome); 
             auxp=rank[i].ponto;
             
             rank[i].ponto=rank[x].ponto;
             strcpy(rank[i].nome,rank[x].nome); 
             
             strcpy(rank[x].nome,auxn); 
             rank[x].ponto=auxp;
            }
          }
        }

       for(i=0;i<qtd;i++){
         printf("\n> %dº %s ------------------- %d Pts",i+1,rank[i].nome,rank[i].ponto);
        }
        
    getchar();
}*/