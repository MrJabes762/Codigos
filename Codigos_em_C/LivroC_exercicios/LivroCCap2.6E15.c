#include <stdio.h>
#include <locale.h>
int main(void) {
  setlocale (LC_ALL, "Portuguese");
  char L;
  int i;
  float f;
  scanf ("%d %c %f",&i,&L,&f);
  printf("\n-> %d %c %f \n-> %d|%c|%f\n-> %d\n-> %c\n-> %f",i,L,f,i,L,f,i,L,f);
  return 0;
}