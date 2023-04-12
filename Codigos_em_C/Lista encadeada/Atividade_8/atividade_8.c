#include <stdio.h>
#include <stdlib.h>

/*Considere duas listas simplesmente encadeadas (L1 e L2) que armazenam valores reais. 
Crie uma função em C que concatene a lista L2 no final da lista L1.*/

typedef struct {
    float valor;
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
    Lista->Ultimo->Prox = (Apontador) malloc(sizeof(struct TipoNo));
    Lista->Ultimo = Lista->Ultimo->Prox;
    Lista->Ultimo->Item = x;
    Lista->Ultimo->Prox = NULL;
    Lista->tamanho ++;
}
TipoLista *concatenaLista(TipoLista **p0, TipoLista **p1){
    TipoLista *p01 = NULL;
    TipoLista *p;
     if (*p0 == NULL) p01 = *p1;
     else{
        p01 = *p0;
       if (*p1 != NULL){
            p = *p0;
            while (p->Ultimo-> Proxi != NULL){
             p = p->Ultimo -> Proxi;
             p->Ultimo -> Proxi= *p1;
            }
       }
       *p0 = NULL;
     *p1 = NULL;
     return p01;
    }
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
    TipoLista Lista1,Lista2,Lista3;
    TipoNo Celula1, Celula2;
    Inicia (&Lista1);
    Inicia (&Lista2);
    Vazia (&Lista1);
    Vazia (&Lista2);
    Insere (Celula1,&Lista1);
    Insere (Celula2,&Lista2);
    Lista3 = *concatenaLista (&Lista1,&Lista2);
    Imprime (Lista3);
    return 0;
}