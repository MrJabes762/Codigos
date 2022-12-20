#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define taMax 5

typedef struct  {
  char nome[45];
  char endereco[80];
  char telefone[15]; 
}contato;

int main(){
   contato agenda[taMax];
    int op, z, x=0;
	setlocale(LC_ALL,"portuguese");
	
	do{
		system("cls"); 
		printf(" INFORME A OPÇÃO\n 01-Cadastrar\n 02-Imprimir\n 0-Sair\n");
		scanf("%d",&op);
		switch(op){
			case 1:{
				system("cls");
				if (x>taMax){
				 printf("Agenda Cheia!\n");	
				}else{
				printf("TELA DE CADASTRO\n");
				printf("");
				fflush(stdin);
				printf("Nome: ");
				gets(agenda[x].nome);
				fflush(stdin);
                printf("Endereço: ");
				gets(agenda[x].endereco);
				fflush(stdin);
				printf("Telefone: ");
				gets(agenda[x].telefone);
				fflush(stdin);
				x++;
			    }
				break;
			}
			case 2:{
				system("cls");
				printf("LISTA DE CONTATOS\n");
			    for (z=0; z<x; z++){
			    	printf("Nome: %s\n", agenda[z].nome);
			    	printf("Endereço: %s\n", agenda[z].endereco);
			    	printf("Nome: %s\n", agenda[z].telefone);
			        printf("\n*****************\n");	
				}
				system("pause");	
				break;
			}
			case 0:{
				printf("Até breve!!!!");
				break;
			}
			default:{
				printf("Opção inválida\n");
				system("pause");
				break;
			} 
				
		}

	}while (op!=0);	
	 
	return 0;
}
