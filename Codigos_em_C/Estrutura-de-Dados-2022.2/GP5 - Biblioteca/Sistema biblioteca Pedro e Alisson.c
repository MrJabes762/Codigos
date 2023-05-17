//  ALISSON E PEDRO



#include <stdio.h>

#include <stdbool.h>

#include <string.h>



#define MAX_LIVROS      100

#define MAX_RESERVAS    10

#define MAX_USUARIOS    100

#define MAX_EMPRESTIMOS 300



// Estrutura para armazenar data



typedef struct{

    int dia;

    int mes;

    int ano;

} Data;



// Estrutura para armazenar usuario



typedef struct{

    char nome[100];

    char login[10];

    char senha[10];

} Usuario;



// Estrutura para armazenar livro



typedef struct{

    char nome[100];

    char registro[10];

    char autor[100];

    char editora[100];

    bool disponivel;

    Data data_publicacao;

    int qtd_reservas;

    Usuario reservas[MAX_RESERVAS];

} Livro;



// Estrutura para armazenar emprestimo



typedef struct{

    Usuario usuario;

    Livro livro;

    Data data_emprestimo;

} Emprestimo;



// Vetores que armazenam dados (livros, usuarios e emprestimos) do sistema



Livro livros[MAX_LIVROS];

int qtd_livros = 0;



Usuario usuarios[MAX_USUARIOS];

int qtd_usuarios = 0;



Emprestimo emprestimos[MAX_EMPRESTIMOS];

int qtd_emprestimos = 0;



/*

Funcao que dado login e senha retorna o usuario cadastrado com estes dados

Caso nenhum usuario possua os dados, retorna NULL

*/



Usuario * buscarUsuario(char login[10], char senha[10]){

    int i;

    for (i = 0; i < qtd_usuarios; i++){

        if((strcmp(login, usuarios[i].login) == 0) && (strcmp(senha, usuarios[i].senha) == 0)){

            return &usuarios[i];

        }

    }

    return NULL;

}



/*

Funcao que imprime os livros cadastrados no sistema

*/



void listarLivros(){

    int i;

    for (i = 0; i < qtd_livros; i++){

        printf("\n-----------------------------\n");

        printf("Nome da Obra: %s\n", livros[i].nome);

        printf("Registro: %s\n", livros[i].registro);

        printf("Autor: %s\n", livros[i].autor);

        printf("Editora: %s\n", livros[i].editora);

        printf("Data de publicacao: %d/%d/%d\n", livros[i].data_publicacao.dia, livros[i].data_publicacao.mes, livros[i].data_publicacao.ano);

        if((livros[i].disponivel == true) && (livros[i].qtd_reservas == 0)){

            printf("Status: Disponivel\n");

        }else if(livros[i].disponivel == false){

            printf("Status: Emprestado\n");

        }else{

            printf("Status: Lista de Espera\n");

        }

        printf("-----------------------------\n");

    }

}



/*

Funcao que imprime os usuarios cadastrados no sistema

*/



void listarUsuarios(){

    int i;

    for (i = 0; i < qtd_usuarios; i++){

        printf("\n-----------------------------\n");

        printf("Nome: %s\n", usuarios[i].nome);

        printf("Login: %s\n", usuarios[i].login);

        printf("Senha: %s\n", usuarios[i].senha);

        printf("-----------------------------\n");

    }

}



/*

Funcao que imprime os emprestimos ativos do sistema

*/



void listarEmprestimos(){

    int i;

    for (i = 0; i < qtd_emprestimos; i++){

        printf("\n-----------------------------\n");

        printf("Nome do usuario: %s\n", emprestimos[i].usuario.nome);

        printf("Nome da Obra: %s\n", emprestimos[i].livro.nome);

        printf("Registro: %s\n", emprestimos[i].livro.registro);

        printf("Autor: %s\n", emprestimos[i].livro.autor);

        printf("Editora: %s\n", emprestimos[i].livro.editora);

        printf("Data de publicacao: %d/%d/%d\n", emprestimos[i].livro.data_publicacao.dia, emprestimos[i].livro.data_publicacao.mes, emprestimos[i].livro.data_publicacao.ano);

        printf("Data do emprestimo: %d/%d/%d\n", emprestimos[i].data_emprestimo.dia, emprestimos[i].data_emprestimo.mes, emprestimos[i].data_emprestimo.ano);

        printf("-----------------------------\n");

    }

}



/*

Funcao que dado registro retorna o livro cadastrado com este registro

Caso nenhum livro possua este registro, retorna NULL

*/



Livro * buscarLivro(char registro[10]){

    int i;

    for (i = 0; i < qtd_livros; i++){

        if(strcmp(registro, livros[i].registro) == 0){
