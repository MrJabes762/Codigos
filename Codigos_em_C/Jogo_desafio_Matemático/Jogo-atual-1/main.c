#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>
#include <string.h>
#include <math.h>
//================================= ESTRUTURA E VARIAVEIS GLOBAIS ===================================
int menu=1,jogos=0,opcao,jogox=1,result,result2,xy,contadorerrada = 0;
double xyf;
char SN;
FILE *data,*Rank; // PONTEIRO DO ARQUIVO
struct data{ // ESTRUTURA DE GRAVAÇÃO E EXIBIÇÃO DE DADOS
  char nome[30];
  int pontos,df,resposta,fase,x,y,z,w,tipo;
  double resposta2;
  }run;
//================================= FERRAMENTAS =====================================================
// -- ferramenta para limpar Buffer do teclado 
void bfclear(){ // sempre usar essa função após scanf
   int c;
   while( (c = getchar()) != EOF && c != '\n' ) {}
  }
// -- ferramenta para limpar as variáveis
void limpa_vetor(){
  for(int i=0;i>30;i++){
    run.nome[i]=' ';
  }
  run.df=0;
  run.fase=0;
  run.pontos=0;
  run.x=0;
  run.y=0;
  run.z=0;
  run.w=0;
  run.tipo=0;
  run.resposta2=0;
  run.resposta=0;
  }
// ABRE ESCRITA NO ARQUIVO
void abre_escrita(){
  data = fopen("data.txt", "w");
  if(data == NULL){
    printf("ERRO: Problemas ao acessar o arquivo data.txt\nO jogo será finalizado!");
    getchar();
    exit(1);
  }
  result = fprintf(data,"%s\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%lf\n%d\n",run.nome,run.df,run.fase,run.pontos,run.x,run.y,run.z,run.w,run.tipo,run.resposta2,run.resposta);
  fclose(data);
  if(result < 0){
    printf("\nErro na escrita!");
    getchar();
    exit(1);
    }
}
// ABRE LEITURA DO ARQUIVO
void abre_leitura(){
  data = fopen("data.txt", "r");
  if(data == NULL){
    printf("ERRO: Problemas ao acessar o arquivo data.txt");
    printf("O jogo será finalizado!");
    getchar();
    exit(1);
  }
  fscanf(data,"%s",run.nome),
  fscanf(data,"%d",&run.df);
  fscanf(data,"%d",&run.fase),
  fscanf(data,"%d",&run.pontos);
  fscanf(data,"%d",&run.x),
  fscanf(data,"%d",&run.y);
  fscanf(data,"%d",&run.z),
  fscanf(data,"%d",&run.w);
  fscanf(data,"%d",&run.tipo),
  fscanf(data,"%lf",&run.resposta2);
  fscanf(data,"%d",&run.resposta);
  fclose(data);
}
// -- Cabeçalhos do jogo
void header(){
   system("clear");
   printf("_____________________________________\n");
   printf("------ JOGO DA SOMA MATEMÁTICA ------\n");
   printf("-------------------------------------\n");
}
void headerjogo(){
  header();
  printf("Dificuldade: %d -- Fase: %d -- Pts: %d\n",run.df,run.fase,run.pontos);
  printf("> %s <\n",run.nome);
}
// ===================================== IMPLEMENTAÇÕES DO JOGO =============================================
// -------------------------------------- FUNÇÕES MATEMÁTICAS -----------------------------------------------
/*                 MODO FÁCIL             */
int adiçãofacil (int *a,int *b,int*s){
    *s = *a + *b;
  return *s;
}
int subtração (int*a, int*b,int*s){
    *s = *a - *b;
  return *s;
}
int multiplicação (int *a,int*b,int*s){
    *s = (*a) * (*b);
    return *s;
}
float divisão (int*a,int*b,double*d){
    *d = (*a) / (*b);
    return *d;
}
/*              MODO MÉDIO             */
int adiçãomedio (int*A,int*B,int* C,int*S){
  *S = *A + *B + *C;
  return *S;
}
int calculopotmedio (int *A, int *B,int *C,int *R){
  *R = ((pow (*A,*B)) - *C);
  return *R;
}
int adição_multi (int *A, int *B, int*C,int*R){
  *R = (*A) * (*B) + *C;
  return *R;
}
int adição_div (int *A, int *B, int*C,float*s){
  *s = *A + ((*B) / (*C));
  return *s;
}
/*              MODO DIFÍCIL           */
int potpot (int*A,int*B,int*C,int*D,int*P){
  *P = pow((*A),(*B)) + pow((*C),(*D));
  return *P;
}
int soma4 (int*A,int*B,int*C,int*D,int*S){
  *S = *A + *B + *C +*D;
  return *S;
}
int sub_soma_sub (int*A,int*B,int*C,int*D,int*Sss){
  *Sss = *A - *B + *C - *D;
  return *Sss;
}
float div_div (int*A,int*B,int*C,int*D,float*Div){
  *Div = ((*A) / (*B) + (*C) / (*D));
  return *Div;
}
// -------------------------------------- ABSTRAÇÕES DE CODIGO ----------------------------------------------
void checajogo(){
  if(run.tipo == 0){
    while (run.tipo == 0){
    run.tipo = (rand ()% 4);}
  }
  if(run.x == 0 && run.y == 0 && run.z == 0 && run.w == 0){  // sorteia os valores caso os mesmos estejam zerados - usado somente na primeira partida
    run.x=(rand() % 31),run.y=(rand() % 31);
    run.z=(rand() % 31),run.w=(rand() % 31);
  }
}
void pergunta(){
  printf ("\nResposta: ");
  scanf ("%d",&xy);
  bfclear ();
}
void perguntaf(){
  printf ("\nResposta: ");
  scanf ("%lf",&xyf);
  bfclear ();
}
void resposta_certa(){
  printf("\n------ Parabéns! Você acertou! ------\n");
  run.x=(rand() % 31);
  run.y=(rand() % 31);
  run.w=(rand() % 31);
  run.z=(rand() % 31);
  run.tipo=(rand() % 4);
  run.fase++;
  run.pontos=run.pontos+5;
  abre_escrita(); // escreve estado atual
  printf("\n  Pressione ENTER para a próxima fase\n     Ou digite M voltar ao menu\n> ");
  scanf("%c",&SN);
  bfclear();
  if(SN =='M'||SN =='m'){
    jogox=0;
  }
}
void resposta_errada(){
  printf("\n------ Que pena, Você errou! ------\n");
  printf("\nVocê Chegou até a fase: %d \n",run.fase);
  printf("\nE conquistou %d Pts \n",run.pontos);
  printf("\nTente outra Vez!");
  //Trazendo os dados de um arquivo para o outro;
    Rank = fopen ("Rank.txt","a");
    if ((xy != run.resposta2) || (xy != run.resposta2)){
      if (Rank == NULL){
        printf ("Erro na gravação de dados para o rank");
        getchar ();
        exit (1);
      }
    result = fprintf(Rank,"Nome: %s\nFase:%d\nPontos: %d\nDificuldade: %d\n",run.nome,run.fase,run.pontos,run.df); 
      if(result < 0){
        printf("Erro na escrita\n");
        fclose(Rank);
          exit (1);  
        }
    fclose (Rank);
    }
  limpa_vetor();
  abre_escrita();
  getchar();
  jogox=0;
}
// ------------------------------------------ MODOS DE JOGO -------------------------------------------------
void facil (){//  MODO FÁCIL
  while(jogox==1){
    checajogo();
    abre_escrita();
    abre_leitura();
    switch (run.tipo){
      case 1:{   //Adição
        adiçãofacil (&run.x, &run.y,&run.resposta);
        abre_escrita(); //depois pode tirar
        headerjogo();  
        printf ("Pergunta = Quanto é %d + %d ?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("          < %d + %d = %d >          \n",run.x,run.y,run.resposta);                         
          resposta_certa();
        }else{
          header();
          printf("          < %d + %d + %d = %d >          \n",run.x,run.y,run.z,run.resposta);
          resposta_errada(); 
        }
        break;
      }
      case 2:{//Subtração. 
        subtração (&run.x, &run.y,&run.resposta);
        abre_escrita(); //depois pode tirar
        headerjogo();  
        printf ("Pergunta = Quanto é %d - %d ?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();
          printf("          < %d - %d = %d >          \n",run.x,run.y,run.resposta);
          resposta_certa();                                   
        }else{
          header();           
          printf("          < %d - %d = %d >          \n",run.x,run.y,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 3:{//Mutiplicação    
        multiplicação (&run.x, &run.y,&run.resposta);    
        abre_escrita();
        headerjogo();
        printf ("Pergunta = Quanto é %d * %d ?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("          < %d * %d = %d >          \n",run.x,run.y,run.resposta);                         
          resposta_certa(); 
        }else{
          header();                        
          printf("          < %d * %d = %d >          \n",run.x,run.y,run.resposta);
          resposta_errada(); 
        }              
        break;
      }
      case 4:{ //Divisão 
        while ((run.x == 0) || ((run.x % 2) != 0)){
          run.x = (rand () % 10);}
        while ((run.y == 0) || ((run.y % 2) != 0)){
          run.y = (rand () % 10);}
        divisão (&run.x, &run.y,&run.resposta2);  
        abre_escrita();  
        headerjogo();  
        printf ("Pergunta = Quanto é %d / %d ?",run.x,run.y);
        perguntaf();
        if(xyf == run.resposta){
          header();              
          printf("          < %d / %d = %.f >          \n",run.x,run.y,run.resposta2);                         
          resposta_certa();  
        }else{
          header();
          printf("          < %d / %d = %.2f >          \n",run.x,run.y,run.resposta2); 
          resposta_errada();
        }
        break;
      }
    }
  }
}
void medio(){
}     
void dificil(){
}       
// ============================================= JOGO ========================================================
void jogo(){
  while(jogox==1){
    limpa_vetor();
    abre_leitura(); // abertura em modo leitura para test de conteudo
    switch(run.df){
      case 1:
      facil();
      break;
      case 2:
      medio();
      break;
      case 3:
      dificil();
      break;
    }
  }
  };
int main() {
  while(menu == 1){
    jogox=1;
    header();
    printf("\n 1 - NOVO JOGO\n");
    printf(" 2 - CONTINUAR JOGANDO\n");
    printf(" 3 - EXIBIR RANK\n");
    printf(" 0 - SAIR\n");
    printf("\n> Opção: ");
    scanf("%d",&opcao);
    bfclear();
    switch(opcao){
      case 1: // NOVO JOGO
        do{
          limpa_vetor();  
          header();
          printf("      ****    NOVO JOG0    ****      \n");
          printf("\nDigite seu nome: \n> "); // PENSEI EM UM LIMITADOR DE 3 CARACTERES PARA O NOME POR FINALIDADE DE ESTÉTICA NA APRESENTAÇÃO DOS DADOS.
          scanf("%s",run.nome);
          header();
          printf("\nEscolha a dificuldade: \n");
          printf("\n1 - Fácil\n");
          printf("2 - Médio\n");
          printf("3 - Difícil\n");
          printf("\n> opção: ");
          scanf("%d",&run.df);
          bfclear();
          if(run.df < 1 || run.df > 3){
            printf("Opção invalída");
            getchar();
          }
          run.fase=1;
          abre_escrita();
        }while((run.df < 1) || (run.df > 3));
        header();
        printf("\n       Jogo criado com Sucesso!      \n");
        printf("\n     Se prepare para o desafio %s!   \n     \n      Pressione ENTER para começar.\n",run.nome);
        getchar();
        jogo();
      break;
      case 2: // CONTINUAR JOGANDO
        do{
          limpa_vetor();
          abre_leitura();
          // verifica se existe jogo ativo
          if(run.x == 0 && run.y == 0){
            header();
            printf("> Nenhum jogo ativo foi encontrado!\n\n\n        Pressione ENTER para\n      voltar ao Menu Principal.\n");
            getchar();
            break;
          } // fim verificação
          header();
          printf("****      CONTINUE SEU JOG0      ****\n");
          printf("\n");
          printf(" Nome: %s\n",run.nome); 
          printf(" Dificuldade: %d\n",run.df); // -- NÃO IMPLEMENT
          printf(" Fase: %d\n",run.fase);
          printf(" Pontos: %d\n",run.pontos);
          printf("\n\nAperte ENTER para começar o desafio!");
          getchar();
          jogo();
        }while(SN == 'S');
      break;
      case 3: // Rank 
        do{
          SN='S';
          printf("\n**** JOG0 MATEMÁTICO ****\n");
          printf("\nS/N?");
          SN=getchar();
        }while(SN == 'S');
      break;
      case 0: // SAIR
      header();
      printf("\nVocê deseja sair?\n\n(S/N): ");
      scanf("%c",&SN);
      bfclear();
      if(SN == 's' || SN == 'S'){
        exit(0);
        }else 
          if(SN == 'n'|| SN == 'N'){
            menu=1;
         }else{
           printf("     Opção inválida!");
      }
      break;
    }  
  } 
  return 0;
}