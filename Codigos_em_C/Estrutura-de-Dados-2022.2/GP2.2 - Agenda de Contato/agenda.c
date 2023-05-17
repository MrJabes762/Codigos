#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

#define MAX 10

typedef struct Contato
{
    char nome[20];
    char numeroTelefone[30];
    char email[30];
} Contato;

typedef struct Agenda
{
    int primeiro, ultimo;
    Contato Contato[MAX];
} Agenda;

void ordenarAlfabeticamente(Agenda *agenda);
void deletarContato(Agenda *A, char nome[]);
void pesquisarContato(Agenda *A, char name[]);
void listarContatos(Agenda A);
void inserirContato(Agenda *A, Contato C);
void iniciar(Agenda *A);

void iniciar(Agenda *A)
{
    A->primeiro = 0;
    A->ultimo = A->primeiro;
}

int listaCheia(Agenda *A)
{
    return A->ultimo == MAX;
}

void inserirContato(Agenda *A, Contato C)
{
    if (listaCheia(A))
    {
        printf("agenda cheia");
    }
    else
    {
        A->Contato[A->ultimo] = C;
        A->ultimo++;
    }
    ordenarAlfabeticamente(A);
}

void listarContatos(Agenda A)
{
    int i;
    for (i = A.primeiro; i < A.ultimo; i++)
    {
        printf("%s %s\n", A.Contato[i].nome, A.Contato[i].numeroTelefone);
    }
    system("pause");
}

void pesquisarContato(Agenda *A, char name[])
{

    for (int i = A->primeiro; i < A->ultimo; i++)
    {
        if (strcmp(A->Contato[i].nome, name) == 0)
        {
            printf("\nNome: %s\n", A->Contato[i].nome);
            printf("Numero: %s\n", A->Contato[i].numeroTelefone);
            printf("Email: %s\n", A->Contato[i].email);
            system("pause");
            system("cls");
            return;
        }
    }

    printf("Contato não encontrado!\n");
    system("pause");
}

void deletarContato(Agenda *A, char nome[])
{
    int posicao = -1;
    for (int i = 0; i < A->ultimo; i++)
    {
        if (strcmp(A->Contato[i].nome, nome) == 0)
        {
            posicao = i;
            break;
        }
    }
    if (posicao == -1)
    {
        printf("Contato não encontrado\n");
    }
    else
    {
        for (int i = posicao; i < A->ultimo - 1; i++)
        {
            A->Contato[i] = A->Contato[i + 1];
        }
        A->ultimo--;
        printf("Contato deletado com sucesso!\n");
    }
    system("pause");
    system("cls");
}

void ordenarAlfabeticamente(Agenda *agenda)
{
    for (int i = 0; i < agenda->ultimo - 1; i++)
    {
        for (int j = 0; j < agenda->ultimo - i - 1; j++)
        {
            if (strcmp(agenda->Contato[j].nome, agenda->Contato[j + 1].nome) > 0)
            {
                Contato temp = agenda->Contato[j];
                agenda->Contato[j] = agenda->Contato[j + 1];
                agenda->Contato[j + 1] = temp;
            }
        }
    }
}

int main()
{
    setlocale(LC_ALL, "");
    Agenda agenda;
    Contato contato;
    iniciar(&agenda);

    int opcao;
    while (1)
    {
        char nome[30];
        char numero[20];
        char email[50];

        printf("Escolha uma opcao:\n");
        printf("1. Inserir contato\n");
        printf("2. Pesquisar contato\n");
        printf("3. Listar contatos\n");
        printf("4. Deletar contato\n");
        printf("5. Sair\n");

        scanf("%d", &opcao);

        system("cls");
        switch (opcao)
        {
        case 1:

            printf("Digite o nome: ");
            scanf("%s", &nome);
            strcpy(contato.nome, nome);

            printf("Digite o email: ");
            scanf("%s", &email);
            strcpy(contato.email, email);

            printf("Digite o numero telefone: ");
            scanf("%s", &numero);
            strcpy(contato.numeroTelefone, numero);

            inserirContato(&agenda, contato);
            system("cls");
            break;
        case 2:
            // char nome2[30];
            printf("Digite o nome que será pesquisado: ");
            scanf("%s", &nome);
            system("cls");
            pesquisarContato(&agenda, nome);
            break;
        case 3:
            listarContatos(agenda);
            break;
        case 4:
            // char nome3[30];
            printf("Digite o nome que será deletado: ");
            scanf("%s", &nome);
            system("cls");
            deletarContato(&agenda, nome);
            break;
        case 5:
            return 0;
        default:
            printf("Comando invalido");
        }
    }
}
