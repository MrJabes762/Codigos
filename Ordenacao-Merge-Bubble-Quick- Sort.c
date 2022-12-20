#include <stdio.h>
#include <stdlib.h>

void merge_sort(int vetor[], int ini, int fim){ 
    int meio, i, j, k, aux[10];
   
    if(ini < fim){
      meio = (ini + fim) / 2;
      merge_sort(vetor, ini, meio);
      merge_sort(vetor, meio + 1, fim);

      i = ini;
      j = meio + 1;
      k = ini;

      while((i <= meio) && (j <= fim)){
        if(vetor[i] < vetor[j]){
          aux[k] = vetor[i];
          i++;
        }
        else{
          aux[k] = vetor[j];
          j++;
        }
        k++;
      }

      while(i <= meio){
        aux[k] = vetor[i];
        i++;
        k++;
      }
      while (j <= fim){
        aux[k] = vetor[j];
        j++;
        k++;
      }

      for (i = ini; i <= fim; i++)
        vetor[i] = aux[i];
    }
}



void Bubblesort (int vetor[], int n) {
    int k, j, aux;

    for (k = n - 1; k > 0; k--) {
        for (j = 0; j < k; j++) {
            if (vetor[j] > vetor[j + 1]) {
                aux          = vetor[j];
                vetor[j]     = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
}

int divC (int vetor[], int esq, int dir){
	int i,aux, cont=esq;
	 
	for(i=esq+1; i<=dir; i++){
		if(vetor[i]<vetor[esq]){
			cont++;
			aux=vetor[i];
			vetor[i]=vetor[cont];
			vetor[cont]=aux;
		}
	}
	aux=vetor[esq];
	vetor[esq]=vetor[cont];
	vetor[cont]=aux;
	
	return cont;
}

void quicksort(int vetor[],int esq, int dir){
	int pos;
	if (esq<dir){
		pos=divC(vetor,esq,dir);
		quicksort(vetor,esq,pos-1);
		quicksort(vetor, pos+1,dir);
	}
}

int main(){
    int v[]={3,5,8,1,9,2,4,7,0,6};
	int i, n=10;	
	
	printf ("\n QuickSort \n\n");
	quicksort(v,0,n);
	
	for (i=0;i<n;i++){
		printf("%d -", v[i]);
	}
	
	printf("\n");
	
	system("pause");

	printf ("\n BubbleSort \n\n");
	Bubblesort(v,n);
	
	for (i=0;i<n;i++){
		printf("%d -", v[i]);
	}
	printf("\n");
	system("pause");
		
	printf ("\n MergeSort \n\n");
	merge_sort(v,0,10);
	
	for (i=0;i<n;i++){
		printf("%d -", v[i]);
	}
	
	printf("\n");
	system("pause");
	
	return 0; 
}
