#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TaMax 5

typedef int Apontador;

typedef struct {
	int dado;
}TipoDado;

typedef struct {
	TipoDado Vdados[TaMax];
	Apontador primeiro, ultimo;
}TipoLista;

void InicializarL (TipoLista *L){
	L -> primeiro = 0;
	L -> ultimo = L -> primeiro;
}

void InserirLista (TipoLista *L, TipoDado d){
	if (L->ultimo == TaMax){
		printf ("\nErro! Lista cheia \n ");
	}else {
		L -> Vdados [L -> ultimo] = d;
		L -> ultimo ++;
	}
}

void ImprimirLista (TipoLista L){
	Apontador aux;
	for (aux = L.primeiro; aux < L.ultimo; aux++){
		printf ("%d\n",L.Vdados[aux].dado);
	}
}

int main (){
	TipoDado valor;
	TipoLista lista;
	int operacao;
	InicializarL (&lista);
	do{
		operacao = -1;
		system ("cls");
		printf ("\n ===============================================================\n");
		printf ("\n-> Ola usuario que operacao deseja fazer ?    \n\n");
		printf ("  0 - Sair do Progama\n  1 - Inserir dados\n  2 - Imprimir lista  \n");
		printf ("\n ===============================================================\n");
		printf ("\n -> Operacao: ");
		scanf ("%d", &operacao);
		printf ("\n ===============================================================\n");
		system ("pause");
			switch (operacao){
				case 0:{
					return 0;
					break;
				}
				case 1: {
					system ("cls");
					printf ("\n ===============================================================\n");
					printf ("-> Informe o valor que deseja armazenar na lista: ");
					scanf ("%d",&valor.dado);
					InserirLista (&lista,valor);
						if (lista.ultimo == (TaMax + 1)){
							return 1;
						}else if (lista.ultimo < (TaMax + 1)){
							printf ("\n-> Valor inserido com sucesso !\n\n");
						}
					printf ("\n ===============================================================\n");
					system ("pause");
					break;
				}
				case 2:{
					system ("cls");
					printf ("\n ===============================================================\n");
					printf ("-> Os dados da lista informada. \n\n");
						ImprimirLista (lista);
					printf ("\n\n ===============================================================\n");
					system ("pause");
					break;
				}
			}
	}while ((operacao != 0) && (lista.ultimo < (TaMax + 1)));
	system ("pause");
	return 0;
}
