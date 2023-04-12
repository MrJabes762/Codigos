#include <stdio.h>
#include <stdlib.h>
#include <locale.h> 
#define contatos 500

typedef struct
{
	char nome [30];
	char endereco [50];
	int telefone; 
}ficha_do_contato;

int main(void)
{
	ficha_do_contato cont[contatos];
	system("cls");
	printf("======================================================\n");
	for (int i = 0; i < contatos; i++){
		printf ("-> Insira as informações do %d º contato\n\n", i);
		printf ("-> Nome: ");
		fflush (stdin);
		fgets (cont[i].nome, 30, stdin);
		printf ("-> Endereço: ");
		fflush (stdin);
		fgets (cont[i].endereco, 50, stdin);
		printf ("-> Telefone: ");
		scanf ("%d", &cont[i].telefone);
	 	printf("======================================================\n");
	}
	printf("======================================================\n");
	printf ("                       Contatos informados           \n ");
	printf("======================================================\n");
	for (int i = 0; i < contatos; i++){
		printf ("-> Nome: %s\n",cont[i].nome);
		printf ("-> Endereço: %s\n",cont[i].endereco);
		printf ("-> Telefone: %d\n",cont[i].telefone);
	 	printf("======================================================\n");
	}	
	system ("pause");
	return 0;
}