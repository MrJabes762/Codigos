
#include<stdio.h>
#include<stdlib.h>

int main() {
   int dividendo;
   int divisor;

   printf("Digite o valor do dividendo:");

   scanf("%d", &dividendo);


   printf("\nDigite o valor do divisor:");

   scanf("%d", &divisor);

   if (divisor == 0) {
      printf("-1\n");
   }
   else if ((dividendo / divisor < 0)) {
      printf("Valor encontrado: 0\n");
   }
   else {
      printf("Valor calculado: %d \n", (dividendo / divisor));
   }

   system("PAUSE");
}
