#include <stdio.h>
#include <locale.h>

int main(void) {
  setlocale (LC_ALL, "Portuguese");
  int I;
  printf ("-> Informe a sua idade: ");
  scanf ("%d", &I);
    if (I >= 5 && I <= 7){
        printf ("\n-> De acordo com sua idade a sua categoria é ->Infantil A<-");
    } else if (I >= 8 && I <= 10){
        printf ("\n-> De acordo com sua idade a sua categoria é ->Infantil B<-");
      } else if (I >= 11 && I <= 13){
        printf ("\n-> De acordo com sua idade a sua categoria é ->Juvenil A<-");
        } else if (I >= 14 && I <= 17){
          printf ("\n-> De acordo com sua idade a sua categoria6 é ->Juvenil B<-");
          } else if (I >= 18){
            printf ("\n-> De acordo com sua idade a sua categoria é ->Sênior<-");
            }
  return 0;
}