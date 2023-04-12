#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define limi 5

void Leitura (int * ptr){
    int i;
    for (i = 0; i < limi; i++){
        printf ("Informe os numero");
        scanf ("%d", &*ptr);
        ptr++;
    }
}
void Calcm (int *ptr){
    int i,soma=0;
    float media;
    for (i = 0; i < limi; i++){
        soma = soma + *ptr;
        ptr++;
    }
    media = soma / limi;
    printf ("A média dos valores é = %.2f",media);
}
int main (void){
    system ("cls");
    setlocale (LC_ALL, "portuguese");
    int v[limi],*p1, *p3;
    p1 = v;
    Leitura (p1);
    p3 = p1;
    Calcm(p3);
    return 0;
}