#include <stdio.h>
#include <stdlib.h>

#define TaMax 5

typedef int Apontador;

typedef struct {
	 int Dado;
}TipoDado;

typedef struct {
	TipoDado Vdados[TaMax];
	Apontador primeiro, ultimo;
}TipoLista;

void Inicializar (TipoLista *L){	
	L->primeiro=0;
	L->ultimo=L->primeiro;
}

void InserirLista(TipoLista *L, TipoDado d){
	if (L->ultimo==TaMax){
		printf("\nErro! Lista Cheia\n");
	}else{
		L->Vdados[L->ultimo]=d;
		L->ultimo++;
	}
}
void ImprimirLista(TipoLista L){
	Apontador aux;
	
	for (aux=L.primeiro;aux<L.ultimo;aux++){
	 printf("%d\n",L.Vdados[aux].Dado);
}
}

int RemoverLista(TipoLista *L){
	int v; 
	Apontador aux;
    
    v=L->Vdados[L->ultimo-1].Dado;
    L->ultimo--;
    
    return v;	
	
}	
	
int main (){
	TipoLista lista;
	TipoDado valor;
	int rem;
	
	Inicializar(&lista);
	valor.Dado=1;
	InserirLista(&lista, valor);
	valor.Dado=2;
	InserirLista(&lista, valor);
	valor.Dado=3;
	InserirLista(&lista, valor);
	valor.Dado=4;
	InserirLista(&lista, valor);
	ImprimirLista(lista);
	rem=RemoverLista(&lista);
	printf("\nRemovido: %d\n",rem);
	printf("\nLista Nova\n");
	ImprimirLista(lista);
	printf("\nLista Nova\n");
	valor.Dado=5;
	InserirLista(&lista, valor);
	valor.Dado=6;
	InserirLista(&lista, valor);
	rem=RemoverLista(&lista);
	printf("\nRemovido: %d\n",rem);
	valor.Dado=7;
	InserirLista(&lista, valor);
	ImprimirLista(lista);
	return 0; 
}


