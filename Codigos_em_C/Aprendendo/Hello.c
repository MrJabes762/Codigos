#include <stdio.h>
#include <locale.h>
int main(void) {
  setlocale (LC_ALL, "Portuguese");
  printf("Hello World\n");
  return 0;
}