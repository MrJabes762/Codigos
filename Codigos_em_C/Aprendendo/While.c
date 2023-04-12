#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main (){
    setlocale (LC_ALL, "Portuguese");
    int A = 5;

    while (A >= 1){
        printf ("\n %d \n", A);
        A--;
    }
    system ("pause");
return 0;
}
