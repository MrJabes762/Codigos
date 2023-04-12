#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct cadastro{ 
    char nome[20], rua[20]; 
    int idade;
}c,cad[0];
void limpeza_de_buffer () { 
   int c;
   while( (c = getchar()) != EOF && c != '\n' ) {}
}
int main(){
  int i = 0, pos = 0, result,presult;
  char r,nome[20];

  FILE *f = fopen("arquivo.txt","a");//escrita no arquivo 
  if(f == NULL){
      printf("Erro na abertura\n");
      system("pause");
      exit(1);
  }
  do{
      system ("cls");
      printf ("\n-> Informe dados sobre o cliente: ");
      scanf ("%s%s%d",cad[0].nome,cad[0].rua,&cad[0].idade);
          limpeza_de_buffer ();
      fwrite(cad,sizeof(struct cadastro),1,f);
      printf ("\n\n-> Há algum novo cliente a ser cadastrado [S/N]? ");
      scanf ("%c", &r);
      fflush (stdin);
  }while (r == 's'|| r == 'S');
  fclose(f);
  f = fopen("arquivo.txt","r");//do arquivo pro programa
  if(f == NULL){
      printf("Erro na abertura\n");
      system("pause");
      exit(1);
  }
  system ("cls");
  printf ("\n-> Por favor digite o seu nome: ");
  scanf ("%s",nome);
  while(!feof(f)){
      fseek(f,i*sizeof(struct cadastro),SEEK_SET);//movimentação do cursor 
      fread(&c,sizeof(struct cadastro),1,f);//escrita na variavel 
      result = strcmp (nome, c.nome);
          if (result == 0){
              pos = i;
          }
      i++;
  }
  if (pos != 0){
      fseek(f,pos*sizeof(struct cadastro),SEEK_SET);
      fread(&c,sizeof(struct cadastro),1,f);
      fclose(f);
      printf ("-> Ola %s voce mora na rua %s e tem %d anos.\n",c.nome,c.rua,c.idade);
      system("pause");
  } else {
      printf ("\n -> Usuario invalido ou nao cadastrado.");
      system ("pause");
      fclose(f);
  }
  return 0;
}
