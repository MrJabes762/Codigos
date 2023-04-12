#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct
{
	int codigo, qtd;
	char nome [15];
	float preco; 
}dados_do_produto;


void menu (){
    printf ("=============================================================\n");
    printf ("                      CADASTRO DE PRODUTOS                   \n");
    printf ("=============================================================\n");
}
void cadastro_de_produtos (dados_do_produto *prod, int total){
    for (int i = 0; i < total; i ++){//cadastro dos produtos 
        system ("cls");
        menu ();
        printf ("\n=============================================================\n");
        printf ("=> Informe os seguintes dados sobre cada produto [%d/%d]: ", i+1, total);
        printf ("\n\n=> Codigo: ");
        scanf ("%d", &prod[i].codigo);
        fflush (stdin);
        printf ("\n=> Nome: ");
        fgets (prod[i].nome,15,stdin);
        printf ("\n=> Quantidade: ");
        scanf ("%d", &prod[i].qtd);
        printf ("\n=> Preco: ");
        scanf ("%f", &prod[i].preco);
        printf ("\n=============================================================\n");
        fflush (stdin);
    }
    printf ("\n-> produtos: %d\n",total);
    for (int i = 0; i < total; i++){
        printf ("\n->\n %d - Codigo: %d \n -> Nome: %s \n -> Quantidade: %d\n -> Preco: %.2f \n\n",i + 1, prod[i].codigo,prod[i].nome,prod[i].qtd,prod[i].preco);
    }
    system ("pause");
}
int main(void)
{
    int N;
    system ("cls");
    menu ();
    printf ("-> Informme a quantidade de produtos no estoque do mercado: ");
    scanf ("%d",&N);
    printf ("\n=============================================================\n");
    dados_do_produto produtos[N], *ptr;
    ptr = produtos;
    cadastro_de_produtos (&ptr, N);
    int localizador,codigo_busca, qtd_busca;
        do {//LOCALIZADOR
            do{
                localizador = -1;
                codigo_busca = -1;
                system ("cls");
                printf ("==============================================================================\n");
                printf ("                                     PEDIDO                                   \n");
                printf ("==============================================================================\n");
                printf ("=> Informe os dados o codigo e a quantidade do produto que deseja fazer pedido: ");
                printf ("\n=> Código (se deseja sair digite 0): ");
                scanf ("%d", &codigo_busca);
                printf ("\n=> Quantidade: ");
                scanf ("%d", &qtd_busca);
                printf ("\n=============================================================\n");
                    for (int i = 0; i < N; i++){
                        printf ("1");
                        if (codigo_busca == produtos[i].codigo){
                            printf ("1");
                            localizador =  i;
                        }
                    }
                    if (localizador == -1){
                        printf ("-> PRODUTO NAO LOCALIZADO TENTE NOVAMENTE...\n");
                        system ("pause");
                    }else if ((localizador != -1) && (qtd_busca > produtos[localizador].qtd)){
                        printf ("=> PRODUTO LOCALIZADO, MAS EXCEDE QUANTIDADE EM ESTOQUE.\n");
                        printf ("\n=> Não é possivel fazer a operação.\n");
                    }
                printf ("\n=============================================================\n");
            }while ((localizador == -1) && (codigo_busca == -1));
                if (localizador != -1){
                    printf ("=> PRODUTO LOCALIZADO!");
                    printf ("\n=> Produto: %s, Codigo: %d, Quantidade: %d, Preco: %.2f", produtos[localizador].nome, produtos[localizador].codigo, produtos[localizador].qtd,produtos[localizador].preco);
                    printf ("\n=============================================================\n");
                    system ("pause");
                    system ("cls");
                    printf ("\n=============================================================\n");
                    printf ("=> Atualizando estoque...\n");
                    printf ("\n=============================================================\n");
                    system ("pause");
                    printf ("\n=> Produto: %s, Codigo: %d, Quantidade: %d, Preco: %.2f", produtos[localizador].nome, produtos[localizador].codigo,produtos[localizador].qtd -= qtd_busca,produtos[localizador].preco);
                    printf ("\n=============================================================\n");
                    system ("pause");
                }
        }while (codigo_busca != 0);
    system ("pause");
	return 0;
}