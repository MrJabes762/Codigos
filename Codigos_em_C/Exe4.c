/*
4. Crie um programa em C que dado um vetor de 10 posições de inteiros, seja criado
outros dois vetores, coloque metade dos elementos em um e outra metade no outro.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	int i, z, v[10]={1,3,4,5,6,9,2,0,7,8};
	int v1[5],v2[5], *ptr, *ptr2, *ptr3;
	ptr=v;
	ptr2=v1;
	ptr3=v2;
	
	for (i=0; i<10; i++){
	  if ((i>=0) && (i<=4)){
	  	*ptr2=*ptr;
	  	 printf("%d\n",*ptr);
	  	 ptr2++;
	  	 ptr++;
	  }else{
	  	*ptr3=*ptr;
	  	printf("%d\n",*ptr);
	  	 ptr3++;
	  //	 ptr++;
	  }	
	}
	
	printf("Vetor Original\n");
	for(z=0; z<9; z++){
		printf("O %d\n", *ptr);
		ptr++;
	}
	printf("Vetor dividido \n");
	for(z=0; z<5; z++){
		printf("V1 %d e V2 %d\n", *ptr2, *ptr3);
		ptr2++;
		ptr3++;
	}
	
	return 0; 
}
