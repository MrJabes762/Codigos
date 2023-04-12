#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void troca(int *pv1, int *pv2)
{
    int aux;
    aux = *pv1;
    *pv1 = *pv2;
    *pv2 = aux;
}

int main(void)
{
    setlocale(LC_ALL, "Portuguese");
    int v1, v2, *p1, *p2;
    system("cls");
    printf("-> Insira dois valores: ");
    scanf("%d%d", &v1, &v2);
    p1 = &v1;
    p2 = &v2;
    troca(p1, p2);
    printf("Os valores de P1 e P2 trocados são: %d e %d\n", *p1, *p2);
    system("pause");
    return 0;
}