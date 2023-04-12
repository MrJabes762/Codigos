#include <stdio.h>
#include <stdlib.h>

/*Considere uma lista simplesmente encadeada que armazena os seguintes dados de alunos de uma disciplina:

Número de matrícula: Inteiro

Nome: até 80 caracteres

Média na disciplina: Número real

Defina a estrutura apropriada para abarcar esses dados e em seguida
implemente uma função em C que insira, em ordem crescente pelo número de matrícula, os dados de um novo aluno na lista.*/
typedef struct {
    int Matricula;
    char nome[80];
    float media;
}Tipodado;

typedef struct tipono *Apontador;

typedef struct {
    Tipodado dado;
    Apontador Proxi;
}TipoNo;

typedef struct{
    Apontador Primeiro, Ultimo, referencia;
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
    Lista->Ultimo->Proxi = (Apontador) malloc(sizeof(struct TipoNo));
    Lista->Ultimo = Lista->Ultimo->Proxi;
    Lista->Ultimo->Item = x;
    Lista->Ultimo->Prox = NULL;
    int ordenandomenor;
    Lista -> referencia= 0;
    Lista -> Ultimo = 0;
    ordenandomenor = Lista-> Ultimo-> Proxi -> dado.Matricula;
    for (((Lista -> referencia-> Proxi) = (Lista-> Primeiro)); ((Lista -> referencia -> Proxi) < Lista -> tamanho - 1); (Lista -> referencia -> Proxi) ++){
        for (((Lista -> Ultimo -> Proxi) = (Lista -> Primeiro)); ((Lista -> Ultimo -> Proxi) < Lista-> tamanho); (Lista -> Ultimo) ++){
            ordenandomenor = Lista -> Ultimo -> Proxi -> dado.Matricula;
            if (((Lista-> Ultimo -> Proxi -> dado.Matricula) < (Lista-> referencia -> Proxi-> dado.Matricula))){
                (Lista -> referencia -> Proxi-> dado.Matricula) = (Lista -> Ultimo -> Proxi->dado.Matricula);
                (Lista -> Ultimo -> Proxi->dado.Matricula) = ordenandomenor;
            }
        }
    }
    Lista->tamanho ++;
}

int main (){
    TipoLista listaa;
    TipoNo celula;
    Inicia (&listaa);
    Vazia (&listaa);
    Insere (celula,&listaa);
    return 0;
}