#include <stdio.h>
#include <stdlib.h>
#include <locale.h> 
#define qtd 40

typedef struct
{
	char nome [30];
	int numero, numero_de_moradores;
	float valor, area; 
}dados_de_apartemento;

dados_de_apartemento apartamentos[qtd];

void cadastro_de_dados_dos_apartamentos (){
    printf("======================================================\n");
    for (int i = 0; i < qtd; i++){
		printf ("\n->- Insira as informacoes de %d º apartamento\n\n", i);
		printf ("\n-> Nome do responsavel: ");
		fflush (stdin);
		fgets (apartamentos[i].nome, 30, stdin);
		printf ("\n-> numero: ");
		scanf ("%d", &apartamentos[i].numero);
		printf ("\n-> area: ");
		scanf ("%f", &apartamentos[i].area);
		printf ("\n-> numero de moradores: ");
		scanf ("%d", &apartamentos[i].numero_de_moradores);
	 	printf("======================================================\n");
	}

}
float somatoria_de_areas_totais (){
    float somatoria_area_do_condominio = 0;
    for (int i = 0; i < qtd; i++){
        somatoria_area_do_condominio += apartamentos[i].area;
    }
    return somatoria_area_do_condominio;
}
void valor_a_ser_pago_no_mes (int areacond){
	float despesa = 0.0;
	printf ("\n======================================================");
	printf ("\n-> Informe o valor das despesas totais do condominio: ");
	scanf ("%f",&despesa);
	printf ("\n======================================================");
		for (int i = 0; i < qtd; i++){
			apartamentos[i].valor = despesa/qtd;
		}
}
void maior_numero_de_moradores (){
	int maior_numero_de_m = 0, posicao;
	for (int i = 0; i < qtd; i++){
		if ((apartamentos[i].numero_de_moradores > maior_numero_de_m)){
			maior_numero_de_m = apartamentos[i].numero_de_moradores;
			posicao = i;
		}
	}
	printf ("\n-> O apartamento com o maior numero de moradores é: ");
	printf ("\n-> Nome do responsavel: %s", apartamentos[posicao].nome);
	printf ("\n-> numero: %d", apartamentos[posicao].numero);
	printf ("\n-> area: %f", apartamentos[posicao].area);
	printf ("\n-> numero de moradores: %d", &apartamentos[posicao].numero_de_moradores);
	printf ("\n-> Valor: %.2f", apartamentos[posicao].valor);
	printf("======================================================\n");
}

int main(){
	int operacao;
	do{
		system ("cls");
		printf ("\n======================================================");
		printf ("\n-> Qual operacao deseja fazer ?\n\n");
		printr ("      1 - Cadastro de dados de apartamentos \n");
		printf ("      2 - Exibir area total do condominio\n");
		printf ("      3 - Exibir o valor a ser pago no mes \n");
		printf ("      4 - Exibir o maior numero de moradores\n");
		printf ("      5 - Sair do programa ");
		printf ("\n======================================================");
		printf ("-> Operacao: ");
		scanf ("%d",&operacao);
		printf ("\n======================================================");
		system ("pause");
			switch (operacao){
				case 1:{
					cadastro_de_dados_dos_apartamentos ();
					break;
				}
				float result = 0.0;
				case 2:{
					result = somatoria_de_areas_totais ();
					printf ("-> Area total do condominio: %.2f", result);
					break;
				}
				case 3:{
					valor_a_ser_pago_no_mes (result);
					break;
				}
				case 4: {
					printf ("\n======================================================");
					maior_numero_de_moradores ();
					break;
				}
			}
	}while ((operacao > 0) && (operacao < 5));
	system ("pause");
	return 0;
}