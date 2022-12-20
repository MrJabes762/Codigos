#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

# define MAXTAM 5

typedef int Apontador;

typedef struct {
  int valor;
} TipoDado;

typedef struct {
  TipoDado Vdados[MAXTAM];
  Apontador Topo;
} TipoPilha;

// Operações 
void Inicia(TipoPilha *Pilha)
{
	Pilha -> Topo = -1;
}

int Vazia(TipoPilha Pilha)
{
	return (Pilha.Topo == -1);
}

void Empilha(TipoDado Dado, TipoPilha *Pilha)
{
    if (Pilha->Topo == MAXTAM-1){
	  printf(" Erro pilha esta  cheia\n");
	 }
	else{
	   Pilha->Topo++;
	   Pilha->Vdados[Pilha->Topo] = Dado;
	   }
}


void Desempilha(TipoPilha *Pilha, TipoDado *Dado)
{
    if (Vazia(*Pilha)){
      printf(" Erro   pilha esta  vazia\n");
	}
	else {
	    *Dado = Pilha->Vdados[Pilha->Topo];
	    Pilha->Topo--;
	   }
}

void imprimirPilha(TipoPilha Pilha){
  if(Vazia(Pilha)){
    printf("\n| Pilha Vazia!");
  }else{
    int Aux;
    for(Aux = Pilha.Topo; Aux >=0; Aux--){	
      printf("\n[ %dº ] da Pilha: %d\n ",Aux,Pilha.Vdados[Aux].valor);
    }
  }
}

int main(){
	TipoPilha p;
	TipoDado  d;
	setlocale(LC_ALL,"portuguese");
	
	Inicia(&p);
	
	d.valor=1;
	Empilha(d,&p);
	d.valor=2;
	Empilha(d,&p);
	d.valor=3;
	Empilha(d,&p);
	d.valor=4;
	Empilha(d,&p);
	
	imprimirPilha(p);
	
	
	return 0;
}
