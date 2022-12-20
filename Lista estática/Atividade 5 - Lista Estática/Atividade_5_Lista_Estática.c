#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TaMax 10

typedef int Apontador;

typedef struct {
	int dado;
}TipoDado;

typedef struct {
	TipoDado Vdados[TaMax];
	Apontador primeiro, ultimo, referencia;
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
		if (L -> ultimo == TaMax -5){
			TipoLista lista1, lista2;
		}
		L -> ultimo ++;
	}
}
void Ordenarlista (TipoLista *L){
    int ordenandomenor;
    L -> referencia= 0;
    L -> ultimo = 0;
    ordenandomenor = L -> Vdados[L -> ultimo].dado;
    for (((L -> referencia) = (L -> primeiro)); ((L -> referencia) < TaMax - 1); (L -> referencia) ++){
        for (((L -> ultimo) = (L -> primeiro)); ((L -> ultimo) < TaMax); (L -> ultimo) ++){
            ordenandomenor = L -> Vdados [L -> referencia].dado;
            if (((L-> Vdados[L -> ultimo].dado) < (L-> Vdados[L -> referencia].dado))){
                (L -> Vdados[L -> referencia].dado) = (L -> Vdados[L -> ultimo].dado);
                (L -> Vdados[L -> ultimo].dado) = ordenandomenor;
            }
        }
    }
}

TipoDado Buscanalista (TipoLista L,int Busca){
    TipoDado rbusca;
    L.ultimo = 0;
        for (L.ultimo = L.primeiro; L.ultimo < TaMax; L.ultimo++){
            if ((L.Vdados[L.ultimo].dado) == Busca){
                rbusca = L.Vdados[L.ultimo];
            }
        }
    return rbusca;
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
		operacao = 0;
		system ("cls");
		printf ("\n ===============================================================\n");
		printf ("\n-> Ola usuario que operacao deseja fazer ?    \n\n");
		printf ("\n  1 - Inserir dados\n  2 - Imprimir lista  \n  3 - Busca lista");
		printf ("\n ===============================================================\n");
		printf ("\n -> Operacao: ");
		scanf ("%d", &operacao);
		printf ("\n ===============================================================\n");
		system ("pause");
			switch (operacao){
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
                        Ordenarlista (&lista);
					printf ("\n ===============================================================\n");
					printf ("-> Os dados da lista informada. \n\n");
						ImprimirLista (lista);
					printf ("\n\n ===============================================================\n");
					system ("pause");
					break;
				}
                case 3:{
                    int valor_de_busca;
                    system ("cls");
                    printf ("\n==================================================================\n");
                    printf ("-> Informe o dado a ser buscado na lista: ");
                    scanf ("%d",&valor_de_busca);
                    printf ("\n -> Valor encontrado %d", Buscanalista (lista,valor_de_busca));
                    printf ("\n==================================================================\n");
                    break;
                }
			}
	}while (((lista.ultimo) < (TaMax + 1)));
	system ("pause");
	return 0;
}
