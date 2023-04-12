#include <stdio.h>
#include <locale.h>

 int main (){
     setlocale (LC_ALL, "Portuguese");
     char Cp[10];
     int Q, PI;
     float Vu, Vi,Vf;
     printf ("=============================================================");
     printf ("\n");
     printf ("\n-> Informe o código da peça: ");
     scanf ("%s", &Cp);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
     printf ("\n-> Informe a quantidade da peça: ");
     scanf ("%d", &Q);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
     printf ("\n-> Informe o Preço unitário da peça: ");
     scanf ("%f", &Vu);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
     printf ("\n-> Informe a percentagem: ");
     scanf ("%d", &PI);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
        Vi = (Q * Vu) * PI/100;
        Vf = Vi + (Q * Vu);
     printf ("\n-> Peça: %s", Cp);
     printf ("\n");
     printf ("\n-> Valor do imposto: R$ %.2f", Vi);
     printf ("\n");
     printf ("\n-> Valor Final da Compra: R$ %.2f", Vf);
     printf ("\n");
     printf ("\n=============================================================");
 }
