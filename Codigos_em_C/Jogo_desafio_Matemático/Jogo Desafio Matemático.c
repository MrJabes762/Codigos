#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>
#include <string.h>
#include <math.h>
#define qtd 20
//================================= ESTRUTURA E VARIAVEIS GLOBAIS ===================================
int menu=1,opcao,jogox=1,result,xy,rdn;
char SN,mode[1],arquivo[15];
FILE *data; // PONTEIRO DO ARQUIVO
FILE *datarank;
struct data{ // ESTRUTURA DE GRAVAÇÃO E EXIBIÇÃO DE DADOS
  char nome[15];
  int pontos,df,resposta,fase,x,y,z,w,tipo;
}run;
struct toprank{char nome[15]; int df,fase,pontos;}usuario[qtd],rank;
//================================= FERRAMENTAS =====================================================
// -- ferramenta para limpar Buffer do teclado 
void bfclear(){ // sempre usar essa função após scanf
   int c;
   while( (c = getchar()) != EOF && c != '\n' ) {}
}
// -- ferramenta para limpar as variáveis
void limpa_vetor(){
  for(int i=0;i>15;i++){
    run.nome[i]=' ';
  }
  run.df=0,run.fase=0;
  run.pontos=0;
  run.x=0,run.y=0;
  run.z=0,run.w=0;
  run.tipo=0;
  run.resposta=0;
}
void limpa_rank(){
  for(int i=0;i<15;i++){
    rank.nome[i]=' ';}
    rank.pontos=0,rank.df=0,rank.fase=0;
  for(int i=0;i<qtd;i++){
    usuario[i].pontos=0,usuario[i].df=0,usuario[i].fase=0;
    strcpy(usuario[i].nome," ");}
}
// ABRE ESCRITA NO ARQUIVO
void abre_escrita(){
  data = fopen("data.txt", "w");
  if(data == NULL){
    printf("ERRO: Problemas ao acessar o arquivo. \nO jogo será finalizado!");
    getchar();
    exit(1);
  }
  result = fprintf(data,"%s\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",run.nome,run.df,run.fase,run.pontos,run.x,run.y,run.z,run.w,run.tipo,run.resposta);
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
  fscanf(data,"%s",run.nome),fscanf(data,"%d",&run.df);
  fscanf(data,"%d",&run.fase),fscanf(data,"%d",&run.pontos);
  fscanf(data,"%d",&run.x),fscanf(data,"%d",&run.y);
  fscanf(data,"%d",&run.z),fscanf(data,"%d",&run.w);
  fscanf(data,"%d",&run.tipo),fscanf(data,"%d",&run.resposta);
  fclose(data);
}
// -- Cabeçalhos do jogo
void header(){
  system("clear");
  printf ("________________________________________________\n\n");
  printf ("--------------- DESAFIO MATEMÁTICO -------------\n\n");
  printf ("================================================\n");
}
void headerjogo(){
  header();
  printf("%s > -- Nível: %d -- Fase: %d -- Pts: %d\n",run.nome,run.df,run.fase,run.pontos);
}
// ===================================== IMPLEMENTAÇÕES DO JOGO =============================================
// -------------------------------------- FUNÇÕES MATEMÁTICAS -----------------------------------------------
/*                 MODO FÁCIL             */
int adicaofacil (int *a,int *b,int*s){
    *s = *a + *b;
  return *s;}
int subtracao (int*a, int*b,int*s){
    *s = *a - *b;
  return *s;}
int multiplicacao (int *a,int*b,int*s){
    *s = (*a) * (*b);
    return *s;}
float divisao (int*a,int*b,int*d){
    *d = (*a) / (*b);
    return *d;}
/*              MODO MÉDIO             */
int adicaomedio (int*A,int*B,int* C,int*S){
  *S = *A + *B + *C;
  return *S;}
int calculopotmedio (int *A, int *B,int *C,int *R){
  *R = ((pow (*A,*B)) - *C);
  return *R;}
int adicao_multi (int *A, int *B, int*C,int*R){
  *R = (*A) * (*B) + *C;
  return *R;}
int adicao_div (int *A, int *B, int*C,int*s){
  *s = *A + ((*B) / (*C));
  return *s;}
/*              MODO DIFÍCIL           */
int potpot (int*A,int*B,int*C,int*D,int*P){
  *P = pow((*A),(*B)) + pow((*C),(*D));
  return *P;}
int soma4 (int*A,int*B,int*C,int*D,int*S){
  *S = *A + *B + *C +*D;
  return *S;}
int sub_soma_sub (int*A,int*B,int*C,int*D,int*Sss){
  *Sss = *A - *B + *C - *D;
  return *Sss;}
float div_div (int*A,int*B,int*C,int*D,int*Div){
  *Div = ((*A) / (*B) + (*C) / (*D));
  return *Div;}
// -------------------------------------- ABSTRAÇÕES DE CODIGO ----------------------------------------------
void checajogo(){ // função de controle dos valores aleatórios
  if(run.x == 0 && run.y == 0 && run.z == 0 && run.w == 0){
    rdn=1;
  } // primeiro jogo
  if(rdn == 1){ 
    run.tipo = (rand() %5);//Rodar tipo de jogo aleatoriamente
    srand(time(NULL));
    while ((run.tipo < 1) || (run.tipo > 4)){
        srand(time(NULL));
        run.tipo = (rand() % 5);
    }
    //Sorteio dos valores para as respectivas dificuldades e operações dos jogos 
    if(run.df == 1){ // NIVEL 1
      if ((run.tipo == 1) || (run.tipo == 2)){
        srand(time(NULL));
        run.x=(rand() % 60);
        run.y=(rand() % 60);
      }
      if (run.tipo == 3){
        srand(time(NULL));
        run.x = (rand () % 50);
        run.y = (rand () % 10);
      }
      if (run.tipo == 4){
        do{
          do{
            srand(time(NULL));
            run.w = (rand() % 20);
            run.z = (rand() % 20);
          } while (run.z == 0);
        }while ((run.w % run.z) != 0);
      }
    }
    if(run.df == 2){ // NIVEL 2
        if (run.tipo == 1){
          srand(time(NULL));
          run.x=(rand() % 33);
          run.y=(rand() % 33);
          run.y=(rand() % 33);
        }
        if (run.tipo == 2){
          srand(time(NULL));
          run.x=(rand() % 20);
          run.z=(rand() % 2);
          run.y=(rand() % 30);
        }
        if (run.tipo == 3){
          srand(time(NULL));
          run.x = (rand() % 20);
          run.y = (rand() % 20);
          run.w = (rand() % 30);
        }
        if (run.tipo == 4){
          srand(time(NULL));
          run.x=(rand() % 15);
            do{
              do{
                srand(time(NULL));
                run.w = (rand() % 20);
                run.z = (rand() % 20);
              } while (run.z == 0);
            }while ((run.w % run.z) != 0);
        }
    }    
    if(run.df == 3){ // NIVEL 3
      if (run.tipo == 1){
        srand(time(NULL));
        run.x=(rand() % 10);
        run.w=(rand() % 3);
        run.y=(rand() % 20);
        run.z=(rand() % 2);
      }
      if (run.tipo == 2){
        srand(time(NULL));
        run.x=(rand() % 40);
        run.y=(rand() % 40);
        run.z=(rand() % 40);
        run.w=(rand() % 40);
      }
      if (run.tipo == 3){
        srand(time(NULL));
        run.x=(rand() % 40);
        run.y=(rand() % 40);
        run.z=(rand() % 40);
        run.w=(rand() % 40);
      }
      if (run.tipo == 4){
        do{
          do{
            srand(time(NULL));
            run.x = (rand() % 20);
            run.z = (rand() % 20);
          } while (run.z == 0);
        }while ((run.x % run.z) != 0);
        do{
          do{
            srand(time(NULL));
            run.y = (rand() % 20);
            run.w = (rand() % 20);
          } while (run.w == 0);
        }while ((run.y % run.w) != 0);
      }
    }           
  }
}
void pergunta(){
  printf ("\nResposta: ");
  scanf ("%d",&xy);
  bfclear ();
}
void resposta_certa(){ // Grava estado e incrementos caso
  printf("\n----------- Parabéns! Você acertou! -----------\n");
  rdn=1;
  checajogo();
  run.fase++;
  run.pontos++;
  if((run.fase >= 10) && (run.fase < 20)){
    run.pontos=run.pontos+10;
  }else if((run.fase >= 20) && (run.fase < 30)){
    run.pontos=run.pontos+20;
  }else if((run.fase >= 30) && (run.fase < 40)){
    run.pontos=run.pontos+30;
  }else if((run.fase >= 40) && (run.fase < 50)){
    run.pontos=run.pontos+40;
  }else if(run.fase >= 50){
    run.pontos=run.pontos+50;
  }
  abre_escrita();
  printf("\n       Pressione ENTER para a próxima fase\n           Ou digite M voltar ao menu\n> ");
  SN=getchar();
  if(SN =='M'||SN =='m'){
    jogox=0;
  }
}
void resposta_errada(){
  struct toprank rank;
  printf("\n------------ Que pena, Você errou! ------------\n\n Você jogou o Nível: %d\n E chegou até a fase: %d \n E conquistou: %d Pts \n\n\n            Não desista! Tente outra Vez!\n",run.fase,run.pontos,run.df);
  strcpy(rank.nome,run.nome);
  rank.fase=run.fase,rank.df=run.df,
  rank.pontos=run.pontos;
  datarank=fopen("datarank.bin","a");
  if (datarank == NULL){
    printf ("Erro ao abrir o arquivo Rank.bin");
    getchar ();
    fclose(datarank);
    exit (1);
  }
  fseek(datarank,0,SEEK_END);
  result = fwrite(&rank,sizeof(struct toprank),1,datarank);
  if(result < 0){
    printf("Erro na escrita do arquivo Rank.bin\n");
    getchar();
    fclose(datarank);
    exit (1);  
  }
  fclose(datarank);
  limpa_vetor();
  abre_escrita();
  getchar();
  jogox=0;
}
// ---------------------------------------------- MODOS DE JOGO -------------------------------------------------
void facil (){//-------------------------------//  MODO FÁCIL //-------------------------------------------------
  while(jogox==1){
    checajogo();
    abre_escrita();
    abre_leitura();
    switch (run.tipo){
      case 1:{   //Adição
        adicaofacil (&run.x, &run.y,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();  
        printf ("Pergunta = Quanto é %d + %d?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();
          printf("                  < %d + %d = %d >\n",run.x,run.y,run.resposta);         
          resposta_certa();
        }else{
          header();
          printf("                  < %d + %d = %d >\n",run.x,run.y,run.resposta);  
          resposta_errada(); 
        }
        break;
      }
      case 2:{//Subtração. 
        subtracao (&run.x, &run.y,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();  
        printf ("Pergunta = Quanto é %d - %d?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();
          printf("                  < %d - %d = %d >\n",run.x,run.y,run.resposta);
          resposta_certa();                                   
        }else{
          header();           
          printf("                  < %d - %d = %d >\n",run.x,run.y,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 3:{//Mutiplicação    
        multiplicacao (&run.x, &run.y,&run.resposta);    
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();
        printf ("Pergunta = Quanto é %d * %d?",run.x,run.y);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("                  < %d * %d = %d >\n",run.x,run.y,run.resposta);                        
          resposta_certa(); 
        }else{
          header();                        
          printf("                  < %d * %d = %d >\n",run.x,run.y,run.resposta);
          resposta_errada(); 
        }              
        break;
      }
      case 4:{ //Divisão 
        divisao (&run.w, &run.z,&run.resposta);  
        abre_escrita();// função pra verificação dos dados escritos.
        headerjogo();  
        printf ("Pergunta = Quanto é %d / %d?",run.w,run.z);
        pergunta();
        if(xy == run.resposta){
          header();              
          printf("                  < %d / %d = %d >\n",run.w,run.z,run.resposta);                         
          resposta_certa();  
        }else{
          header();
          printf("                  < %d / %d = %d >\n",run.w,run.z,run.resposta);
          resposta_errada();
        }
        break;
      }
    }
  }
}
void medio(){//------------------------------------ //  MODO MÉDIO // ------------------------------------------------
  while(jogox==1){
    checajogo();
    abre_escrita();
    abre_leitura();
    switch (run.tipo){
      case 1:{   // Adição com 3 operandos.
        adicaomedio (&run.x, &run.y,&run.w,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();
        printf ("Pergunta = Quanto é %d + %d + %d?",run.x,run.y,run.w);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("                < %d + %d + %d = %d >\n",run.x,run.y,run.w,run.resposta);                         
          resposta_certa();
        }else{
          header();
          printf("                < %d + %d + %d = %d >\n",run.x,run.y,run.w,run.resposta); 
          resposta_errada();        
        }
        break;
      }
      case 2:{  //Potenciação, subtração.
        calculopotmedio (&run.x, &run.z,&run.y,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();
        printf ("Pergunta = Quanto é %d ^ %d - %d?",run.x,run.z,run.y);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("                < %d ^ %d - %d = %d >\n",run.x,run.z,run.y,run.resposta);
          resposta_certa();                           
        }else{
          header();  
          printf("                < %d ^ %d - %d = %d >\n",run.x,run.z,run.y,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 3:{//Mutiplicação, adição.      
        adicao_multi (&run.x, &run.y,&run.w,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();        
        printf ("Pergunta = Quanto é %d x %d + %d?",run.x,run.y,run.w);
        pergunta();
        if(xy == run.resposta){
          header();  
           printf("                < %d x %d + %d = %d >\n",run.x,run.y,run.w,run.resposta);                         
          resposta_certa();
        }else{
          header();      
           printf("                < %d x %d + %d = %d >\n",run.x,run.y,run.w,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 4:{// Adição,div. 
        adicao_div (&run.x, &run.w,&run.z,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos. 
        headerjogo();
        printf ("Pergunta = Quanto é %d + %d / %d?",run.x,run.w,run.z);
        pergunta();
        if(xy == run.resposta){
          header();                      
          printf("               < %d + %d / %d = %d >\n",run.x,run.w,run.z,run.resposta);                         
          resposta_certa();         
        }else{
          header();            
          printf("               < %d + %d / %d = %d >\n",run.x,run.w,run.z,run.resposta); 
          resposta_errada();
        }
        break;
      }
    }
  }
}     
void dificil(){//------------------------------------ //  MODO DIFÍCIL // ------------------------------------------------
  while(jogox==1){
    checajogo();
    abre_escrita();
    abre_leitura();
    switch (run.tipo){
      case 1:{//potenciação + potenciação.
        potpot (&run.x, &run.w,&run.y,&run.z,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();
        printf ("Pergunta = Quanto é %d ^ %d + %d ^ %d ?",run.x,run.w,run.y,run.z);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf ("            < %d ^ %d + %d ^ %d = %d >\n",run.x,run.w,run.y,run.z,run.resposta);                         
          resposta_certa(); 
        }else{
          header();
          printf ("            < %d ^ %d + %d ^ %d = %d >\n",run.x,run.w,run.y,run.z,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 2:{//Soma de 4 operandos  
        soma4 (&run.x, &run.y,&run.z,&run.w,&run.resposta);
        abre_escrita();  // função pra verificação dos dados escritos.
        headerjogo();
        printf ("Pergunta = Quanto é %d + %d + %d + %d ?",run.x,run.y,run.z,run.w);
        pergunta();        
        if(xy == run.resposta){
          header();  
          printf("             < %d + %d + %d + %d = %d >\n",run.x,run.y,run.z,run.w,run.resposta);                         
          resposta_certa();
        }else{
          header();
          printf("             < %d + %d + %d + %d = %d >\n",run.x,run.y,run.z,run.w,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 3:{//subtração, soma, subtração
        sub_soma_sub (&run.x, &run.y,&run.z,&run.w,&run.resposta);
        abre_escrita();  // função pra verificação dos dados escritos.
        headerjogo();                
        printf ("Pergunta = Quanto é %d - %d + %d - %d ?",run.x,run.y,run.z,run.w);
        pergunta();
        if(xy == run.resposta){
          header();    
          printf("             < %d - %d + %d - %d = %d >\n",run.x,run.y,run.z,run.w,run.resposta);                        
          resposta_certa();
        }else{
          header();
          printf("             < %d - %d + %d - %d = %d >\n",run.x,run.y,run.z,run.w,run.resposta); 
          resposta_errada();
        }
        break;
      }
      case 4:     {// divisão + divisão 
        div_div (&run.x, &run.z,&run.y,&run.w,&run.resposta);
        abre_escrita(); // função pra verificação dos dados escritos.
        headerjogo();                 
        printf ("Pergunta = Quanto é %d / %d + %d / %d ?",run.x,run.z,run.y,run.w);
        pergunta();
        if(xy == run.resposta){
          header();  
          printf("             < %d / %d + %d / %d = %d >\n",run.x,run.z,run.y,run.w,run.resposta);
          resposta_certa();                          
        }else{
          header();  
          printf("             < %d / %d + %d / %d = %d >\n",run.x,run.z,run.y,run.w,run.resposta); 
          resposta_errada();
        }
        break;
      }
    }
  }
}       
// ============================================= JOGO ========================================================
void jogo(){ // LÊ A DiFICULDADE SELECIONADA E ENCAMINHA PARA UM DOS CASOS
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
    printf("\n 1 - NOVO JOGO\n 2 - CONTINUAR JOGANDO\n 3 - EXIBIR RANK\n 4 - CRÉDITOS\n 0 - SAIR\n\n> Opção: ");
    scanf("%d",&opcao);
    bfclear();
    switch(opcao){
      case 1:{                           // CADASTRA NOVOS JOGOS 
        do{
          rdn = 0;
          limpa_vetor();  
          header();
          printf ("****                 NOVO JOG0              ****\n\nDigite seu nome: \n> "); 
          scanf("%s",run.nome);
          bfclear();
          header();
          printf("\nEscolha a dificuldade: \n\n1 - Fácil\n2 - Médio\n3 - Difícil\n\n> opção: ");
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
         printf ("\n             Jogo criado com Sucesso!      \n\n            Prepare-se para o desafio!   \n     \n           Pressione ENTER para começar.\n");
        getchar();
        jogo();
      break;
      }
      case 2:{       // CONTINUA JOGOS EM ANDAMENTO - fechamento acidental ou opção volta menu
        do{
          limpa_vetor();
          abre_leitura();
          if(run.x == 0 && run.y == 0){            // verifica se existe jogo ativo
            header();
            printf("\n\n\n>       Nenhum jogo ativo foi encontrado!      <\n\n\n\n               Pressione ENTER para\n             voltar ao Menu Principal.\n");
            getchar();
            break;
          }                                              // fim verificação
          header();
          printf ("****             CONTINUE JOGAND0           ****\n\n Nome: %s\n Dificuldade: %d\n Fase: %d\n Pontos: %d\n\n      Pressione ENTER para começar o desafio\n            Ou digite M voltar ao menu\n",run.nome,run.df,run.fase,run.pontos);
          SN=getchar();
          if(SN =='M'||SN =='m'){
            jogox=0;
          }
          jogo();
        }while(SN == 'S');
      break;
      }
      case 3:{ // RANK
       struct toprank usr[qtd];
        int i=0,x=0,auxp,auxd;
        char auxn[15];
            limpa_rank(); // limpa e inicializa os vetores
            for(i=0;i<qtd;i++){
              usr[i].pontos=0;
              usr[i].df=0;
              usr[i].fase=0;
              strcpy(usr[i].nome," ");
            }
            datarank = fopen ("datarank.bin","r");
            if (datarank == NULL){
              printf ("Erro na abertura do arquivo");
              getchar();
              exit (1);
            }
            for(i=0;i<qtd;i++){
              fseek(datarank, i*sizeof(struct toprank),SEEK_SET);
              fread(&usr[i],sizeof(struct toprank),1,datarank);
              fscanf(datarank,"%s",usr[i].nome),fscanf(datarank,"%d",&usr[i].df);         
              fscanf(datarank,"%d",&usr[i].fase),fscanf(datarank,"%d",&usr[i].pontos);   
            }
            fclose(datarank);  
              header();
              printf("------------------ < TOP 10 > ------------------\n");
            for (i=0;i<qtd;i++){ // copia os dados para outro vetor para realocar em ordem decrecente
                usuario[i]=usr[i];  
            }
            for(i=0;i<qtd;i++){
              for(x=i+1;x<qtd;x++){ // realoca vetores em ordem decrecente
                if(usuario[i].pontos < usuario[x].pontos){
                  
                  strcpy(auxn,usuario[i].nome); 
                  auxp= usuario[i].pontos;
                  auxd= usuario[i].df;

                  strcpy(usuario[i].nome,usuario[x].nome);
                  usuario[i].pontos = usuario[x].pontos;
                  usuario[i].df = usuario[x].df;
                   
                  strcpy(usuario[x].nome,auxn); 
                  usuario[x].pontos = auxp;
                  usuario[x].df = auxd;
                }
              }
            }
            for(i=0;i < 10 ;i++){  // exibe as 10 melhores pontuações
                printf("\n> %dº -- %d Pts -- Nível %d --------- %s",i+1,usuario[i].pontos,usuario[i].df,usuario[i].nome);
            }  
            printf ("\n\n\n               Pressione ENTER para\n             voltar ao Menu Principal.\n");
            getchar();  
      break;
      }
      case 4:{
        header();
        printf ("      +++\n      +++                 xx   xx       ///\n  +++++++++++  ---------   xx xx       ///\n  +++++++++++  ---------    xxx       ///\n      +++                  xx xx     ///\n      +++                 xx   xx   ///\n\n================================================\n                    CRÉDITOS\n================================================\n---------------- DESENVOLVEDORES ---------------\n\n> JABES CAJAZEIRA <    IFBA   > LUCAS OLIVEIRA <\n\n================================================\n->             AJUDA NÓIS LEANDRO             <-\n\n                      V 7.62\n\n\n                Pressione ENTER para\n              voltar ao Menu Principal.\n");
        getchar ();
        break;
      }
      case 0:{// SAIR
        header();
        printf("\nVocê deseja sair?\n\n(S/N): ");
        SN=getchar();
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
  } 
  return 0;
}