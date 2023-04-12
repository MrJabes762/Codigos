/*1) Implemente um programa que leia o nome, a idade e o endereço de uma pessoa e
armazene esses dados em uma estrutura. Em seguida, imprima na tela os dados da
estrutura lida.*/
#include <stdio.h>
#include <string.h>

struct Cadastro{
  char nome2[20], endereço2[30];
  int idade2;
};
int main(void) {
  char nome[20], endereço[30];
  int idade;
  struct Cadastro pessoa;
  printf ("\n-> Informe o nome a idade e o endereço (respectivamente): ");
  fflush (stdin);
  scanf ("%s%d%s", nome,&idade,endereço);
  strcpy(pessoa.nome2, nome);
  pessoa.idade2 = idade;
  strcpy(pessoa.endereço2, endereço);
  printf ("\n-> Os dados informados foram: \n Nome = %s \n Idade = %i\n Endereço = %s", pessoa.nome2, pessoa.idade2, pessoa.endereço2);
  
  return 0;
}