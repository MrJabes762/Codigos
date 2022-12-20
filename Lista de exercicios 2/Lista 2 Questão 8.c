#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int N1, N2, N3;
    printf ("=============================================");
    printf ("\n");
    printf ("\n-> Informe 3 numeros: ");
    scanf (" %d %d %d", &N1, &N2, &N3);
    printf ("\n=============================================");
    printf ("\n");
    printf ("\n-> Ordem Decrescente: ");
    printf ("\n");
        if ((N1 > N2) && (N1 > N3) && (N2 < N1) && (N2 > N3) && (N3 < N1) && (N3 < N2)){
            printf ("-> %d %d %d", N1, N2, N3);
        }
        else if ((N1 > N2) && (N1 > N3) && (N3 < N1) && (N3 > N2) && (N2 < N1) && (N2 < N3)){
            printf ("-> %d %d %d", N1, N3, N2);
        }
        else if ((N3 > N2) && (N3 > N1) && (N1 < N3) && (N1 > N2) && (N2 < N3) && (N2 < N1)){
            printf ("-> %d %d %d", N3, N1, N2);
        }
        else if ((N3 > N2) && (N3 > N1) && (N2 < N3) && (N2 > N1) && (N1 < N3) && (N1 < N2)){
            printf ("-> %d %d %d", N3, N2, N1);
        }
        else if ((N2 > N3) && (N2 > N1) && (N3 < N2) && (N3 > N1) && (N1 < N3) && (N1 < N2)){
            printf ("-> %d %d %d", N2, N3, N1);
        }
        else {
            printf ("-> %d %d %d", N2, N1, N3);
        }
   printf ("\n");
   printf ("\n=============================================");
   printf ("\n");
   printf ("\n-> Ordem Crescente: ");
   printf ("\n");
        if ((N1 < N2) && (N1 < N3) && (N2 > N1) && (N2 < N3) && (N3 > N1) && (N3 > N2)){
            printf ("-> %d %d %d", N1, N2, N3);
        }
        else if ((N1 < N2) && (N1 < N3) && (N3 > N1) && (N3 < N2) && (N2 > N1) && (N2 > N3)){
            printf ("-> %d %d %d", N1, N3, N2);
        }
        else if ((N3 < N2) && (N3 < N1) && (N1 > N3) && (N1 < N2) && (N2 > N3) && (N2 > N1)){
            printf ("-> %d %d %d", N3, N1, N2);
        }
        else if ((N3 < N2) && (N3 < N1) && (N2 > N3) && (N2 < N1) && (N1 > N3) && (N1 > N2)){
            printf ("-> %d %d %d", N3, N2, N1);
        }
        else if ((N2 < N3) && (N2 < N1) && (N3 > N2) && (N3 < N1) && (N1 > N3) && (N1 > N2)){
            printf ("-> %d %d %d", N2, N3, N1);
        }
        else if ((N2 < N1) && (N2 < N3) && (N1 > N2) && (N1 < N3) && (N3 > N1) && (N3 > N2)){
            printf ("-> %d %d %d", N2, N1, N3);
        }
   printf ("\n");
   printf ("\n=============================================");
}
