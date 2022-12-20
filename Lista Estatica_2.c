#include <stdio.h>
#include <stdlib.h>

#define TaMax 5

typedef int Apontador;

typedef struct {
	int dado; 
}TipoDado;

typedef struct {
	TipoDado Vdados[TaMax];
	Apontador primeiro, ultimo;
}TipoLista;

void InicializarL(TipoLista *L){
   L->primeiro=0;
   L->ultimo=L->primeiro;
}

void InserirLista(TipoLista *L, TipoDado d){
	
	if (L->ultimo==TaMax){
		printf("\nErro! Lista cheia\n");
	}else{
		L->Vdados[L->ultimo]= d;
		L->ultimo++; 
	}
}

void ordenaLista (TipoLista *L){
	int k, j, aux;

    for (k = TaMax - 1; k > 0; k--) {
        for (j = 0; j < k; j++) {
            if (L->Vdados[j].dado > L->Vdados[j+1].dado ) {
                aux          = L->Vdados[j].dado;
                L->Vdados[j].dado = L->Vdados[j+1].dado;
                L->Vdados[j+1].dado = aux;
           }
        }
    }
}

int RemoverL(TipoLista *L){
	int v;
	if (L->primeiro==L->ultimo){
		printf("ERRO! Lista Vazia.");
	}else{
	v=L->Vdados[L->ultimo-1].dado;
    L->ultimo--;	
    return v;
	}
}

void ImprimirLista(TipoLista L){
	Apontador aux; 
	for (aux=L.primeiro; aux<L.ultimo; aux++){
		printf("%d\n", L.Vdados[aux].dado);
	}
}

int main(){
	TipoDado valor;
	TipoLista lista; 
	int n;
	
	InicializarL(&lista);
	
	valor.dado=3; 
	InserirLista(&lista,valor); 
	valor.dado=2;
	InserirLista(&lista,valor); // 1/ 2
	valor.dado=1;
	InserirLista(&lista,valor); // 2/ 3
	valor.dado=4;
	InserirLista(&lista,valor);// 3/ 4
	printf("\nLista 1\n");
	ordenaLista(&lista);
	ImprimirLista(lista);
	printf("\nLista 2\n");
	valor.dado=6; 
	InserirLista(&lista,valor);  // 4/ 5
	ImprimirLista(lista);
	valor.dado=5;
	InserirLista(&lista,valor);
	printf("\nLista 3\n");
	ImprimirLista(lista);
	n=RemoverL(&lista);
	printf("\nLista 4\n");
	ImprimirLista(lista);
	printf("\nLista 5\n");
	n=RemoverL(&lista);
	ImprimirLista(lista);
	return 0; 
}
