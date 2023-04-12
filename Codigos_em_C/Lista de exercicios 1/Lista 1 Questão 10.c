#include <stdio.h>
#include <locale.h>

int main (){
    setlocale(LC_ALL, "Portuguese");
    float B,H,A;
    printf ("=============================================\n");
    printf ("\n");
    printf ("-> Informe a Base e a Altura do Triangulo: ");
    scanf ("%f%f", &B, &H);
        A =  (B * H)/2;
    printf ("\nA Área do Triângulo é: %.1f  ", A);
    printf ("\n");
    printf ("\n=============================================");
}
