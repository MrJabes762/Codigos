include <stdio.h>
#include <stdlib.h>
#define TaMax 3

typedef int Apontador;

typedef struct {
	char Nome_completo [60];
	int idade; 
	char sexo[10];
	char rg [10];
	char Cpf[11];
	char nome_do_responsavel[60];
	char Cpf_responsavel [11];
	float Renda_bruta;
	char endereco[60];
	int telefone;
	int numero_registro;
}TipoDado;

typedef struct {
	TipoDado cadastros[TaMax];
	Apontador primeiro,ultimo;
}TipoLista;

void inicializar (TipoLista *l){
	l->primeiro = 0;
	l->ultimo = l->primeiro;
}

void cadastrar (TipoLista *L, TipoDado dados){
	if (L -> ultimo == TaMax){
		printf ("ERRO! LISTA CHEIA");
	}else {
		L -> cadastros[L -> ultimo] = dados;
		L -> ultimo ++;
	}
}

void ImprimirLista (TipoLista L){
	Apontador aux;
	printf ("\n======================================================");
	for (aux = L.primeiro; aux < L.ultimo; aux++) {
		printf ("\nNome Completo: %s",L.cadastros[aux].Nome_completo);
		printf ("\nCPF: %s",L.cadastros[aux].Cpf);
		printf ("\n======================================================");
	}
}

int main (){
	TipoLista Lista;
	TipoDado dado;
	inicializar (&Lista);
	dado.numero_registro = 0;
	printf ("\n======================================================");
	printf ("\n-> Por Favor informe os seguintes dados: \n");
	for (int x = 0; x < TaMax; x++){
		fflush (stdin);
		printf ("\nNome Completo: ");
		fgets (dado.Nome_completo, 60, stdin);
		printf ("\nIdade: ");
		scanf ("%d",&dado.idade);
		fflush (stdin);
		printf ("\nSexo: ");
		fgets (dado.sexo, 10, stdin);
		fflush (stdin);
		printf ("\nCPF: ");
		fgets (dado.Cpf, 11, stdin);
		fflush (stdin);
		printf ("\nRG: ");
		fgets (dado.rg, 10, stdin);
		if (dado.idade < 18){
			fflush (stdin);
			printf ("\nNome do Respons�vel: ");
			fgets (dado.nome_do_responsavel, 60, stdin);
			fflush (stdin);
			printf ("\nCpf do Responsavel: ");
			fgets (dado.Cpf_responsavel, 11, stdin);
		}
		fflush (stdin);
		printf ("\nEndereco: ");
		fgets (dado.endereco, 11, stdin);
		fflush (stdin);
		printf ("\nRenda Bruta: ");
		scanf ("%f",&dado.Renda_bruta);
		printf ("\nTelefone: ");
		scanf ("%d",&dado.telefone);			
		printf ("\n======================================================\n");
		dado.numero_registro++;
		cadastrar (&Lista, dado);
	}	
	ImprimirLista (Lista);
	return 0;
}

