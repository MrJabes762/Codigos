#include <stdio.h>
#include <locale.h>

int main (){
    setlocale(LC_ALL, "Portuguese");
    int N1, N2;
    printf ("=============================================");
    printf ("\n");
    printf ("\n-> Informe 2 n�meros inteiros: ");
    scanf ("%d %d", &N1, &N2);
    printf ("\n");
    printf ("\n=============================================");
    printf ("\n");
        if (N1 < N2){
            printf ("\n-> A ordem crescente �: 1� - %d, 2� - %d.", N1, N2);
        }
            else {
                printf ("\n-> A ordem crescente �: 1� - %d, 2� - %d.", N2, N1);
            }
    printf ("\n");
    printf ("\n=============================================");
return 0;
}
