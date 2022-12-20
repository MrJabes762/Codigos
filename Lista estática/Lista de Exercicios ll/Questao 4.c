#include <stdio.h>
#include <stdlib.h>
#include <locale.h> 
#define alunos 20

typedef struct
{
	char nome [30];
	char matricula [50];
	float nota1, nota2, nota3; 
}ficha_do_aluno;

int main(void)
{
	ficha_do_aluno cont[alunos];
	system("cls");
	printf("======================================================\n");
	for (int i = 0; i < alunos; i++){//cadastro
		printf ("\n->- Insira as informacoes do %d º aluno\n\n", i);
		printf ("\n-> Nome: ");
		fflush (stdin);
		fgets (cont[i].nome, 30, stdin);
		printf ("\n-> Matricula: ");
		fflush (stdin);
		fgets (cont[i].matricula, 50, stdin);
		printf ("\n-> nota1: ");
		scanf ("%f", &cont[i].nota1);
		printf ("\n-> nota2: ");
		scanf ("%f", &cont[i].nota2);
		printf ("\n-> nota3: ");
		scanf ("%f", &cont[i].nota3);
	 	printf("======================================================\n");
	}
    int posicao = 0;
    double maiornota = 0.0;
	for (int i = 0; i < alunos; i++){//maiornota
		if ((cont[i].nota1 > maiornota)){
            maiornota = cont[i].nota1;
            posicao = i;        
        }
	}
    printf ("\n-> A maior nota da primeira prova foi a de %s = %.2f.\n", cont[posicao].nome,cont[posicao].nota1);
    double media_geral, maior_media_geral, menor_media_geral;
    int posicao2 = 0;
	for (int i = 0; i < alunos; i++){//maiormediageral
        media_geral = (cont[i].nota1 + cont[i].nota2 + cont[i].nota3)/3;
        if (i == 0){
            menor_media_geral = media_geral;
            maior_media_geral = media_geral;
        }
		if ((media_geral) > (maior_media_geral)){
            maior_media_geral = media_geral;
            posicao = i;        
        }
        if ((media_geral) < (menor_media_geral)){
            menor_media_geral = media_geral;
            posicao2 = i;
        }
	}
    printf ("\n-> A maior media geral foi a de %s = %.2f.\n", cont[posicao].nome, maior_media_geral);
    printf ("\n-> A menor media geral foi a de %s = %.2f.\n", cont[posicao2].nome, menor_media_geral);
	system ("pause");
	return 0;
}