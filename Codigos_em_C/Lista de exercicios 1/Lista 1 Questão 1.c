#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int H, Dh, Rh;
    printf ("===============================================================");
    printf ("\n");
    printf ("\n-> Informe a altura do degrau: ");
    scanf ("%d", &H);
    printf ("\n=============================================================");
    printf ("\n");
    printf ("\n-> Qual a altura que deseja alcançar ? ");
    scanf ("%d", &Dh);
        Rh = Dh / H;
    printf ("\n=============================================================");
    printf ("\n");
    printf ("\n-> Faltam %d degraus para vc alcançar a altura %d", Rh, Dh);
    printf ("\n");
    printf ("\n=============================================================");
}
