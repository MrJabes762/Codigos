#include <stdio.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int H, M;
    printf ("\n=====================================================\n");
    printf ("\n -> Informe as Horas: ");
    scanf ("%d", &H);
    printf ("\n=====================================================\n");
        M = H * 60;
    printf ("\n-> Se passaram  %d  Minutos desde o inicio do dia.\n", M);
        if (M > 720){
            printf ("\n-> Já passou do meio dia.\n ");
        }
    printf ("\n=====================================================\n");
return 0;
}
