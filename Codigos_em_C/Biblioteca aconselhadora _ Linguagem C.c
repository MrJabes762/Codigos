#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

    void main (){
        setlocale (LC_ALL, "portuguese");
        char resposta;
        do{
            //apresenta��o inicial
            printf ("\n============================================================================================\n");
            printf ("\n                 Ol� eu sou a indicadora de livros da biblioteca padr�o C                   \n");
            printf ("\n============================================================================================\n");
            printf ("\n-> OBS1.: Esses livros devem est� no inicio do seu c�digo. Eles possuem diversas palavras   \n");
            printf ("remetem a id�ias, que v�o te ajudar a desenvolver seu c�digo para solu��o do problema.        \n");
           /* printf ("\n-> OBS2.: Primordialmente para intera��es entre programadores e m�quina todo c�digo         \n");
            printf ("em sua estrutura b�sica e avan�ada, � escencial incluir em seu c�digo o livro.                \n");
            printf (" '#include <stdio.h>'                                                                         \n");*/
            system ("pause");
            system ("cls");
            char R [24];
            //desenvolver o enredo (c�digo)...//
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
            printf ("\n-> Deseja uma nova indica��o para a resolu��o do problema [s/n]?");
            scanf ("%s", &resposta);
            //limpeza de tela para retorno ao menu //
            if (resposta == 's'){
                system ("cls");
            }
        }while (resposta == 's');
    return 0;
    }
