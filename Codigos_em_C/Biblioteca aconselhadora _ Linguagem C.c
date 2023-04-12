#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        char resposta;
        do{
            //apresentação inicial
            printf ("\n============================================================================================\n");
            printf ("\n                 Olá eu sou a indicadora de livros da biblioteca padrão C                   \n");
            printf ("\n============================================================================================\n");
            printf ("\n-> OBS1.: Esses livros devem está no inicio do seu código. Eles possuem diversas palavras   \n");
            printf ("remetem a idéias, que vão te ajudar a desenvolver seu código para solução do problema.        \n");
           /* printf ("\n-> OBS2.: Primordialmente para interações entre programadores e máquina todo código         \n");
            printf ("em sua estrutura básica e avançada, é escencial incluir em seu código o livro.                \n");
            printf (" '#include <stdio.h>'                                                                         \n");*/
            system ("pause");
            system ("cls");
            char R [24];
            //desenvolver o enredo (código)...//
            //1 pergunta resolver
            printf ("\n Seu problema envolve entrada e saida de dados ? ");
            scanf ("%s", &resposta);
                if (resposta == 's'){
                    R[1] = "->#include<stdio.h>";
                }else{
                    R[1] = "n";
                }
            printf ("\n-> Resposta = %s ", R[1]);
            //limpeza de tela para retorno ao
            //fim do enredo (codigo)//
            system ("pause");
            printf ("\n-> Deseja uma nova indicação para a resolução do problema [s/n]?");
            scanf ("%s", &resposta);
            //limpeza de tela para retorno ao menu //
            if (resposta == 's'){
                system ("cls");
            }
        }while (resposta == 's');
    return 0;
    }
