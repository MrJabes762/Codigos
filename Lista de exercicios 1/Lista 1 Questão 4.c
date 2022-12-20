#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    float Sf, Tv,Sfinal,C;
    printf ("=============================================================");
    printf ("\n");
    printf ("\n Informe o salário fixo do vendedor: ");
    scanf ("%f", &Sf);
    printf ("\n");
    printf ("\n=============================================================");
    printf ("\n");
    printf ("\n-> informe o total de vendas efetuadas: ");
    scanf ("%f", &Tv);
    printf ("\n");
    printf ("\n=============================================================");
    printf ("\n");
        C = Tv * 0.15;
        Sfinal = Sf + C;
    printf ("\n O Salário final é: R$ %.2f", Sfinal);
    printf ("\n");
    printf ("=============================================================");
}
