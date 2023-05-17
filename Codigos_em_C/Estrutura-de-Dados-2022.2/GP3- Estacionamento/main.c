#include <stdio.h>
#include <string.h>
#include <locale.h>
#include <time.h>
#include <stdlib.h>

#define qtdMaximaVeiculos 100
#define precoPorHora 5

struct Veiculo {
  char placa[6];
  time_t horaEntrada;
};

struct Estacionamento {
  struct Veiculo veiculo[qtdMaximaVeiculos];
  int numeroVeiculos;
};

void iniciarEstacionamento(struct Estacionamento *estacionamento) {
  estacionamento -> numeroVeiculos = 0;
}

int inserirVeiculo(struct Estacionamento *estacionamento, char *placaVeiculo) {
	if (estacionamento->numeroVeiculos < qtdMaximaVeiculos)	{
		int indice = estacionamento->numeroVeiculos;
		
		strcpy(estacionamento->veiculo[indice].placa, placaVeiculo);
  		estacionamento->veiculo[indice].horaEntrada = time(NULL);
  		estacionamento->numeroVeiculos++;
  		
		system("cls");  		
		return 1;				
	} else {
		return 0;
	}
}

int procurarVeiculo(struct Estacionamento *estacionamento, char *placaVeiculo) {
  int i;
  for (i = 0; i < estacionamento->numeroVeiculos; i++) {
    if (strcmp(estacionamento->veiculo[i].placa, placaVeiculo) == 0) {
      return i;
    }
  }

  return -1;
}

void listarVeiculos(struct Estacionamento *estacionamento) {
	int i;
  	for (i = 0; i < estacionamento->numeroVeiculos; i++) {
    	printf("%s\n", estacionamento->veiculo[i].placa);
  	}	
}

int verificarQuantidadeVagas(struct Estacionamento *estacionamento) {
    return qtdMaximaVeiculos - estacionamento->numeroVeiculos;
}

int main()
{
    setlocale(LC_ALL, "Portuguese");

    struct Estacionamento estacionamento;
    iniciarEstacionamento(&estacionamento);
	char placaVeiculo[6];
	int retorno;
	
    int opcao;
    do{
        printf("1. Inserir veículo\n");
        printf("2. Retirar veículo\n");
        printf("3. Listar veículos\n");
        printf("4. Procurar veículo\n");
        printf("5. Verificar vagas\n");
        printf("6. Calcular\n");
        printf("7. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);
        system("cls");
        
        switch (opcao){
        case 1:
        	printf("Placa do Veículo: ");
        	scanf("%s", placaVeiculo);
        	system("cls");
        	retorno = inserirVeiculo(&estacionamento, placaVeiculo);
        	if (retorno == 1) {
				printf("Veículo inserido!\n\n");
			} else {
				printf("Não possui vagas!\n\n");
			}
            break;
        case 2:
            //Solicitar placa do veículo (placaVeiculo)
            //Criar função de "retirarVeiculo" que retorne um INT:
            // - parametros: struct Estacionamento, char placaVeiculo; 
            // - verificar se o veiculo está no estacionamento:
            //   - SIM: {remove veiculo do estacionamento (SEM PAGAR), 
            //           return 1}
            //   - NÃO: {return 0}
            break;
        case 3:
        	system("cls");
            listarVeiculos(&estacionamento);
            break;
        case 4:
            printf("Placa do Veículo: ");
        	scanf("%s", placaVeiculo);
            
            retorno = procurarVeiculo(&estacionamento, placaVeiculo);
            if (retorno >= 0) {
                printf("O veículo se encontra na vaga: %d", retorno);
            } else {
                printf("Veículo não está no estacionamento!");
            }
            break;
        case 5:
            retorno = verificarQuantidadeVagas(&estacionamento);
            if (retorno > 0) {
                printf("Há %d vagas.", retorno);
            } else {
                printf("Não há vagas disponíveis");
            }
            break;
        case 6:
            //Solicitar placa do veículo (placaVeiculo)
            //Criar função de "calcularPreco" que retorne um DOUBLE:
            // - parametros: struct Estacionamento, char placaVeiculo;
            //utilizar "procurarVeiculo" para retornar o indice do veiculo.
            //calcular a duração do veiculo (veiculo.horaEntrada) com a hora atual * precoPorHora;
            break;
        case 7:
            break;
        default:
            printf("Opção inválida!\n");
            break;
        }
    } while (opcao != 7);
}
