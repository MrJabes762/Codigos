#include <stdio.h>
struct ponto {
 int x, y;
};
struct data {
 int dia;
 int mes;
 int ano;
};
struct jogador{
	char nome[50];
	int idade;
	float gold;
	struct ponto iniciopartida;
};

int  comparaDatas(struct data data1, struct data data2);

int main(void) {
 struct jogador players[5];

 scanf("%s",  players[0].nome);
 scanf("%d",  &players[0].idade);
 scanf("%f",  &players[0].gold);
 scanf("%d",  &players[0].iniciopartida.x);
 scanf("%d",  &players[0].iniciopartida.y);


 struct data hoje,outrodia;
 hoje.dia = 14;
 hoje.mes = 5;
 hoje.ano = 2021;

 outrodia.dia = 14;
 outrodia.mes = 5;
 outrodia.ano = 2020;

 printf("A data de hoje é: %d/%d/%d", hoje.dia, hoje.mes, hoje.ano );
 printf("A data de outrodia é: %d/%d/%d", outrodia.dia, outrodia.mes, outrodia.ano );

 comparaDatas(hoje, outrodia);

 struct ponto p1, p2;
 
 p1.x = 20;
 p1.y = 40;
 
 p2.x = 20;
 p2.y = 80;

}