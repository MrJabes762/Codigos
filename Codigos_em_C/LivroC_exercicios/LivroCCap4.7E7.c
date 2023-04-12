#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int estado;
  float valor;
  printf ("\n----------------------------------------\n");
  printf ("-> Informe o valor do produto: ");
  scanf ("%f", &valor);
  printf ("\n----------------------------------------\n");
  printf ("-> Informe o seu estado: 1 = mg, 2 = sp, 3 = 12,");
  scanf ("%d", &estado);
  printf ("\n----------------------------------------\n");
    switch (estado){
      case 1: {
        printf ("\n-> O valor total do produto acrescido do imposto = %.2f", valor * (1 + 0.07));
        break;
      }
      case 2:{
        printf ("\n-> O valor total do produto acrescido do imposto = %.2f", valor * (1 + 0.12));
        break;
      }
      case 3:{
        printf ("\n-> O valor total do produto acrescido do imposto = %.2f", valor * (1 + 0.15));
        break;
      }
      case 4:{
        printf ("\n-> O valor total do produto acrescido do imposto = %.2f", valor * (1 + 0.08));
        break;
      }
      default:{
        printf ("\n-> Estado não encontrado.");
      }
    }
  return 0;
}