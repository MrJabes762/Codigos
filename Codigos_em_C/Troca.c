#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void troca(int *pv1, int *pv2){
	int aux;
	
	aux=*pv1;
	*pv1=*pv2;
	*pv2=aux;	 
}

int main(){
   int v1, v2, *pv1, *pv2;
   setlocale(LC_ALL,"portuguese");
   printf("Informe dois números \n");
   scanf("%d%d",&v1,&v2);
   pv1=&v1;
   pv2=&v2;
   troca(pv1, pv2);
   printf("O valor de V1 é %d\n", v1);
   printf("O valor de V2 é %d", v2);
   
  return 0;	
}

