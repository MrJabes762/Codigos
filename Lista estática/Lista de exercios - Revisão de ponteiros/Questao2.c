#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main (void){
    setlocale (LC_ALL, "portuguese");
    int v[5], i, *ptr;
    ptr = v;
    for (i = 0; i < 5; i++){
        *ptr = i * 10;
        printf ("%d\n",*ptr);
        ptr++;
    }
    return 0;
}