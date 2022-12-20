#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define limi 10

int main(void)
{
    system("cls");
    int v[limi], v1[5], v2[5], *pt1, *pt2, *pt3, i = 0;
    setlocale(LC_ALL, "portuguese");
    pt1 = v;
    pt2 = v1;
    pt3 = v2;
    printf("Informe os numeros do vetor: ");
    for (i = 0; i < limi; i++)
    {
        scanf("%d", &*pt1);
        pt1++;
    }
    pt1 = v;
    for (i = 0; i < 5; i++)
    {
        *pt2 = *pt1;
        pt1++;
        pt2++;
    }
    for (i = 0; i < 5; i++)
    {
        *pt3 = *pt1;
        pt1++;
        pt3++;
    }
    for (i = 0; i < limi; i++)
    {
        printf("Os valores do primeiro vetor sao = %d\n", v[i]);
    }
    printf("======================================================\n");
    for (i = 0; i < 5; i++)
    {
        printf("Os valores do segundo vetor sao = %d\n", v1[i]);
    }
    printf("======================================================\n");
    for (i = 0; i < 5; i++)
    {
        printf("Os valores do terceiro vetor sao = %d\n", v2[i]);
    }
    system("pause");
    return 0;
}