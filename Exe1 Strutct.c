#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define max 5

typedef struct {
	char nome[30];
	char endereco[60];
	char telefone[15];
}Contato;

int main (){
	Contato Vcont[max];
	int x;
	
	printf("\nDados do Contato\n");
	for (x=0;x<3;x++){
		fflush(stdin);
		printf("\nNome: ");
		gets(Vcont[x].nome);
		fflush(stdin);
		printf("\nEndereco: ");
		gets(Vcont[x].endereco);
		fflush(stdin);
		printf("\nTelefone: ");
		gets(Vcont[x].telefone);
		fflush(stdin);
		system("cls");
	}
	system("pause");
	
	printf("*********************************\n");
	
	printf("Mostrando os Dados do Contato\n");
	for (x=0;x<3;x++){
		printf("\nNome: %s",Vcont[x].nome);
		printf("\nEndereco: %s ",Vcont[x].endereco);
		printf("\nTelefone: %s",Vcont[x].telefone);
        printf("\n________________________________\n"); 
	}
	return 0;
}
