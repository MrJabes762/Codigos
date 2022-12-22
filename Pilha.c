#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAXTAM 5

typedef int Apontador;

typedef struct
{
	int valor;
} TipoDado;

typedef struct
{
	TipoDado Vdados[MAXTAM];
	Apontador Topo;
} TipoPilha;

// Opera��es
void Inicia(TipoPilha *Pilha)
{
	Pilha->Topo = -1;
}

int Vazia(TipoPilha Pilha)
{
	return (Pilha.Topo == -1);
}

void Empilha(TipoDado Dado, TipoPilha *Pilha)
{
	if (Pilha->Topo == MAXTAM - 1)
	{
		printf(" Erro�pilha esta� cheia\n");
	}
	else
	{
		Pilha->Topo++;
		Pilha->Vdados[Pilha->Topo] = Dado;
	}
}

int Desempilha(TipoPilha *Pilha, TipoDado *Dado)
{
	if (Vazia(*Pilha))
	{
		printf(" Erro�� pilha esta� vazia\n");
	}
	else
	{
		*Dado = Pilha->Vdados[Pilha->Topo];
		Pilha->Topo--;
	}
	return Pilha->Vdados[Pilha->Topo + 1].valor;
}

void imprimirPilha(TipoPilha Pilha)
{
	if (Vazia(Pilha))
	{
		printf("\n| Pilha Vazia!");
	}
	else
	{
		int Aux;
		for (Aux = Pilha.Topo; Aux >= 0; Aux--)
		{
			printf("\n[ %d� ] da Pilha: %d\n ", Aux, Pilha.Vdados[Aux].valor);
		}
	}
}

int main()
{
	int vlr;
	TipoPilha p, p1;
	TipoDado d;
	setlocale(LC_ALL, "portuguese");
	Inicia(&p);
	d.valor = 1;
	Empilha(d, &p);
	d.valor = 2;
	Empilha(d, &p);
	d.valor = 3;
	Empilha(d, &p);
	d.valor = 4;
	Empilha(d, &p);
	d.valor = 5;
	Empilha (d,&p);
	imprimirPilha(p);
	Inicia (&p1);
		for (int i = MAXTAM - 1; i >= 0; i--){
			vlr=Desempilha (&p,&d);
			d.valor=vlr;
			Empilha (d,&p1);
		}
	imprimirPilha (p1);
	return 0;
}
