#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int Horas, Minutos, Segundos, St, A, B, C;
    printf ("=====================================================");
    printf ("\n");
    printf ("\n-> Informe os segundos que deseja converter: ");
    scanf ("%d", &St);
    printf ("\n");
        A =  (St/3600) * 3600;
        Horas =  (A/3600);
        B =  (St - A);
        C = (B/60) * 60;
        Minutos =  C/60;
        Segundos =  (B - C);
    printf ("============================Resultado================================\n");
    printf ("\n");
    printf (" %d h - %d m - %d s.", Horas , Minutos, Segundos);
    printf ("\n");
    printf ("\n=====================================================================");
}
