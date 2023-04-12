#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(void) {
  int a, b;
  do{
          srand(time(NULL));
          a = (rand() % 20);
          b = (rand() % 10);
  }while ((a % b) != 0);
  printf ("%d / %d",a,b);
}