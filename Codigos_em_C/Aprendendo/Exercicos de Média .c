#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");

    int n1, n2, n3;
    float media;
    printf ("Digite tr�s n�meros inteiros: ");
    scanf ("%d%d%d", &n1, &n2, &n3);
    media = (float) (n1+n2+n3)/3;
    printf ("M�dia: %.2f", media);
}
