#include <stdio.h>
#include <stdlib.h>
int main(void)
{
  FILE *pont_arq;
  char c;
      
  pont_arq = fopen("arquivo1.txt","r");
  if (pont_arq == NULL)
  {
    printf("Erro ao tentar abrir o arquivo!");
    exit(1);
  }
  printf("Lendo e exibindo os dados do arquivo \n\n");
  //Faça 
  do
  {  
      //faz a leitura do caracter no arquivo apontado por pont_arq
      c = fgetc(pont_arq);
      if (c == )
      //exibe o caracter lido na tela
      printf("%c" , c);        
  }while (c != EOF);//enquanto não for final de arquivo 
    fclose(pont_arq);//fechando o arquivo
  return(0);
}