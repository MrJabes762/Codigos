#include <stdio.h>
#include <locale.h>

 int main (){
     setlocale (LC_ALL, "Portuguese");
     char Cp[10];
     int Q, PI;
     float Vu, Vi,Vf;
     printf ("=============================================================");
     printf ("\n");
     printf ("\n-> Informe o c�digo da pe�a: ");
     scanf ("%s", &Cp);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
     printf ("\n-> Informe a quantidade da pe�a: ");
     scanf ("%d", &Q);
     printf ("\n");
     printf ("\n=============================================================");
     printf ("\n");
     printf ("\n-> Informe o Pre�o unit�rio da pe�a: ");
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
     printf ("\n-> Pe�a: %s", Cp);
     printf ("\n");
     printf ("\n-> Valor do imposto: R$ %.2f", Vi);
     printf ("\n");
     printf ("\n-> Valor Final da Compra: R$ %.2f", Vf);
     printf ("\n");
     printf ("\n=============================================================");
 }
