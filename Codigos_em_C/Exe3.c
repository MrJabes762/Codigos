/* Crie um programa em C com duas fun��es e um vetor de inteiros 
de tamanho 100 declarado no programa principal, uma fun��o deve realizar a leitura e 
a outra fun��o deve calcular a m�dia dos elementos do vetor. Utilize ponteiros.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void Leitura(int *ptrl){
	int aux;
	printf("\nInforme 5 n�meros inteiros\n");
	for (aux=0; aux<5; aux++){
		scanf("%d",&*ptrl);
		ptrl++;
	}
}

void CalcM(int *ptr){
	int x, soma=0;
    printf("\n********\n");
    
	for (x=0; x<5; x++){
		printf("%d\n",*ptr);
		soma=soma + *ptr;
		ptr++;
	}
	printf("A m�dia �: %d", soma/5);
}


int main(){
	setlocale(LC_ALL,"portuguese");
 	int v[5], i, *ptrv,*ptrv1;
 
 ptrv=v;
 ptrv1=ptrv;
 
 Leitura(ptrv);
 CalcM(ptrv1);	
 return 0;	
}
