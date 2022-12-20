#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int Mat;
    int curso;
}Tipodado;

typedef struct tipono *Apontador;

typedef struct {
    Tipodado dado;
    Apontador Proxi;
}TipoNo;

typedef struct{
    Apontador Primeiro, Ultimo;
    int tamanho;
}TipoLista;

void Inicia(TipoLista *Lista) {
    Lista->Primeiro = (Apontador) malloc(sizeof(struct TipoNo));
    Lista->Ultimo = Lista->Primeiro;
    Lista->Primeiro->Prox = NULL;
    Lista->tamanho = 0;
}
int Vazia(TipoLista *Lista)
{
    return (Lista->Primeiro == Lista->Ultimo);
}

void Insere(TipoNo x, TipoLista *Lista) {
//A inserção é feita à direita do ponteiro Último
    Lista->Ultimo->Prox = (Apontador) malloc(sizeof(struct TipoCNo));
    Lista->Ultimo = Lista->Ultimo->Prox;
    Lista->Ultimo->Item = x;
    Lista->Ultimo->Prox = NULL;
    Lista->tamanho ++;
}
void Remove(Apontador p, TipoLista *Lista, TipoNo *Item){
    // Obs.: o item a ser retirado é o seguinte ao apontado por p 
    Apontador pAux;
    if (Vazia(Lista) || p == NULL || p->Prox == NULL) {
        printf(" Erro Lista vazia ou posicao nao existe\n");
        return;
    }
    pAux = p->Prox;
    *Item = pAux->Item;
    p->Prox = pAux->Prox;
    if (p->Prox == NULL){
        Lista->Ultimo = p;
    }
    free(pAux);
    Lista->tamanho = Lista->tamanho - 1;
}

void Imprime(TipoLista Lista)
{
    Apontador Aux;
    Aux = Lista.Primeiro->Prox;
    while (Aux != NULL) {
        printf("%d\n", Aux->Item.chave);
        Aux = Aux->Prox;
    }
}

int main (){
    return 0;
}