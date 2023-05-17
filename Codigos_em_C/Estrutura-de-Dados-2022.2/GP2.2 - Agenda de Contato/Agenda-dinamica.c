#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Estrutura do Dado
typedef struct {
  long numero;
  char nome[50];
  char email[50];
} Data;

// Estrutura do Ponteiro
typedef struct Cell *Pointer;

// Estrutuda da Célula
struct Cell {
  Data data;
  Pointer next;
};

// Estrutura da Lista
typedef struct {
  Pointer first, last;
  int size;
} List;


// Inicia Lista
void ListInit(List *list) {
  list->first = (Pointer) malloc(sizeof(struct Cell));
  list->last = list->first;
  list->first->next = NULL;
  list->size = 0;

};

// Verifica se a lista está vazia
int ListEmpty(List list) {
  return (list.first == list.last); 
}

// Insere dados na lista
void ListInsert(Data data, List *list) {
  list->last->next = (Pointer) malloc(sizeof(struct Cell));
  list->last = list->last->next;
  list->last->data = data;
  list->last->next = NULL;
  list->size++;
  ListSort(list);
}

// Deleta um dado da lista
int ListDelete(char nome[], List *list) {
  system("cls");
  Pointer aux = list->first;
  Pointer auxPointer;
  int counterAux=0;
  while (aux->next != NULL) {
    if (strcmp(aux->next->data.nome, nome) == 0) {
      auxPointer = aux->next;
      aux->next = aux->next->next;
      free(auxPointer);
      counterAux++;
      break;
    } 
    aux = aux->next;
  }
  if (!counterAux){
    printf("Contato Nao encontrado\n");
    return;
  }
}

// Ordena alfabéticamente
void ListSort(List *list) {
  system("cls");
  Pointer aux = list->first->next;
  Pointer temp;
  Data auxTemp;

  while (aux != NULL) {
    temp = aux;
    while (temp != NULL) {
      if (temp->next != NULL) {
        if (strcmp(temp->data.nome, temp->next->data.nome) > 0) {
          auxTemp = temp->data;
          temp->data = temp->next->data;
          temp->next->data = auxTemp;
          
        }
      }
      temp = temp->next;
    }
    
    aux = aux->next;
  }
}

// Imprime Detalhes sobre um Contato
void PrintDetails(char name[],List list) {
  system("cls");
  Pointer aux = list.first->next;
  int counterAux=0;

  while (aux != NULL) {
    if(strcmp(aux->data.nome, name) == 0) {
      printf("~~~~~~~~\n");
      printf("%s - %li - %s\n",
        aux->data.nome,
        aux->data.numero,
        aux->data.email
      );
      counterAux++;
    }
    aux = aux->next;
  }
  printf("~~~~~~~~\n\n");
  if (!counterAux){
    printf("Contato Nao encontrado\n");
    printf("~~~~~~~~\n\n");
    return;
  }
}

// Imprime todos os contatos
void ListPrint(List list) {
  Pointer aux = list.first->next;

  while (aux != NULL) {
    printf("~~~~~~~~\n");
    printf("%s\n",
      aux->data.nome
    );
    aux = aux->next;
  }
    printf("~~~~~~~~\n\n");
}

void main() {
  List lista;
  Data dado;
  int option, counter=1;
  long numero;
  char nome[50], email[50], excluir_nome[50];
  ListInit(&lista);
  do{
    printf("~~~~~~~~\n");
    printf("Agenda de contatos\n");
    printf("~~~~~~~~\n\n");
    
    printf("Escolha uma opção.\n");
    printf("1 - mostrar contatos.\n");
    printf("2 - detalhes.\n");
    printf("3 - Inserir contato.\n");
    printf("4 - excluir contato.\n");
    printf("0 - sair.\n--> ");
    scanf("%i", &option);

    if (option == 1) {
      system("cls");
      ListPrint(lista);
      continue;
    };

    if (option == 2) {
      char detailContact[50];
      system("cls");
      ListPrint(lista);
      printf("digite nome do contato que quer ver:\n --> ");
      scanf("%s", &detailContact);
      PrintDetails(detailContact, lista);
      continue;
    }

    if (option == 3) {
      system("cls");
      printf("Digite o nome do contato.\n--> ");
      scanf("%s", &nome);
      printf("Digite o numero do contato.\n--> ");
      scanf("%li", &numero);
      printf("Digite o email do contato.\n--> ");
      scanf("%s", &email);

      strcpy(dado.nome, nome);
      strcpy(dado.email, email);
      dado.numero = numero;

      ListInsert(dado, &lista);
      system("cls");
      continue;
    };

    if (option == 4) {
      system("cls");
      ListPrint(lista);
      printf("Digite o nome do contato.\n--> ");
      scanf("%s", &excluir_nome);
      ListDelete(excluir_nome, &lista);
      continue;
    };
  } while(option !=0);
}