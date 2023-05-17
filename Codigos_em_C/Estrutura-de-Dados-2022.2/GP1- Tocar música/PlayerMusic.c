#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct Musica {
	char nome[50];
	char artista[50];
	int duracao;
} Musica;

typedef struct Playlist {
	char nome[50];
	int quantidade;
	Musica *musicas;
} Playlist;

int quantidadePlaylist = 0;
Playlist *playlists;

void criarPlaylist() {
	if(quantidadePlaylist == 0) {
		playlists = malloc(sizeof(Playlist)*quantidadePlaylist+1);
	} else {
		playlists = realloc(playlists, sizeof(Playlist)*quantidadePlaylist+1);
	}
	printf("Digite o nome da playlist: ");
	scanf("%s", playlists[quantidadePlaylist].nome);
	playlists[quantidadePlaylist].quantidade = 0;
	playlists[quantidadePlaylist].musicas = NULL;
	quantidadePlaylist++;
	printf("Playlist criada com sucesso!\n");
}

void inserirMusica() {
	char nomePlaylist[50];
	printf("Digite o nome da playlist: ");
	scanf("%s", nomePlaylist);
	int indicePlaylist = -1;
	for(int i = 0; i < quantidadePlaylist; i++) {
		if(strcmp(playlists[i].nome, nomePlaylist) == 0) {
			indicePlaylist = i;
			break;
		}
	}
	if(indicePlaylist == -1) {
		printf("Playlist não encontrada!\n");
		return;
	}
	if(playlists[indicePlaylist].quantidade == 0) {
		playlists[indicePlaylist].musicas = malloc(sizeof(Musica)*playlists[indicePlaylist].quantidade+1);
	} else {
		playlists[indicePlaylist].musicas = realloc(playlists[indicePlaylist].musicas, sizeof(Musica)*playlists[indicePlaylist].quantidade+1);
	}
	printf("Digite o nome da música: ");
	scanf("%s", playlists[indicePlaylist].musicas[playlists[indicePlaylist].quantidade].nome);
	printf("Digite o artista/banda: ");
	scanf("%s", playlists[indicePlaylist].musicas[playlists[indicePlaylist].quantidade].artista);
	printf("Digite a duração da faixa: ");
	scanf("%d", &playlists[indicePlaylist].musicas[playlists[indicePlaylist].quantidade].duracao);
	playlists[indicePlaylist].quantidade++;
	printf("Música inserida com sucesso!\n");
}

void pesquisarMusica() {
	char nomeMusica[50];
	printf("Digite o nome da música: ");
	scanf("%s", nomeMusica);
	int flag = 0;
	for(int i = 0; i < quantidadePlaylist; i++) {
		for(int j = 0; j < playlists[i].quantidade; j++) {
			if(strcmp(playlists[i].musicas[j].nome, nomeMusica) == 0) {
				printf("Música: %s\n", playlists[i].musicas[j].nome);
				printf("Artista/Banda: %s\n", playlists[i].musicas[j].artista);
				printf("Duração da Faixa: %d\n", playlists[i].musicas[j].duracao);
				printf("Playlist: %s\n", playlists[i].nome);
				flag = 1;
				break;
			}
		}
	}
	if(!flag) {
		printf("Música não encontrada!\n");
	}
}

void listarMusicas() {
	char nomePlaylist[50];
	printf("Digite o nome da playlist: ");
	scanf("%s", nomePlaylist);
	int indicePlaylist = -1;
	for(int i = 0; i < quantidadePlaylist; i++) {
		if(strcmp(playlists[i].nome, nomePlaylist) == 0) {
			indicePlaylist = i;
			break;
		}
	}
	if(indicePlaylist == -1) {
		printf("Playlist não encontrada!\n");
		return;
	}
	for(int i = 0; i < playlists[indicePlaylist].quantidade; i++) {
		printf("Música: %s\n", playlists[indicePlaylist].musicas[i].nome);
		printf("Artista/Banda: %s\n", playlists[indicePlaylist].musicas[i].artista);
		printf("Duração da Faixa: %d\n", playlists[indicePlaylist].musicas[i].duracao);
		printf("\n");
	}
}

void deletarMusica() {
	char nomePlaylist[50];
	printf("Digite o nome da playlist: ");
	scanf("%s", nomePlaylist);
	int indicePlaylist = -1;
	for(int i = 0; i < quantidadePlaylist; i++) {
		if(strcmp(playlists[i].nome, nomePlaylist) == 0) {
			indicePlaylist = i;
			break;
		}
	}
	if(indicePlaylist == -1) {
		printf("Playlist não encontrada!\n");
		return;
	}
	char nomeMusica[50];
	printf("Digite o nome da música: ");
	scanf("%s", nomeMusica);
	int indiceMusica = -1;
	for(int i = 0; i < playlists[indicePlaylist].quantidade; i++) {
		if(strcmp(playlists[indicePlaylist].musicas[i].nome, nomeMusica) == 0) {
			indiceMusica = i;
			break;
		}
	}
	if(indiceMusica == -1) {
		printf("Música não encontrada!\n");
		return;
	}
	for(int i = indiceMusica; i < playlists[indicePlaylist].quantidade-1; i++) {
		playlists[indicePlaylist].musicas[i] = playlists[indicePlaylist].musicas[i+1];
	}
	playlists[indicePlaylist].quantidade--;
	playlists[indicePlaylist].musicas = realloc(playlists[indicePlaylist].musicas, sizeof(Musica)*playlists[indicePlaylist].quantidade);
	printf("Música deletada com sucesso!\n");
}

void deletarPlaylist() {
	char nomePlaylist[50];
	printf("Digite o nome da playlist: ");
	scanf("%s", nomePlaylist);
	int indicePlaylist = -1;
	for(int i = 0; i < quantidadePlaylist; i++) {
		if(strcmp(playlists[i].nome, nomePlaylist) == 0) {
			indicePlaylist = i;
			break;
		}
	}
	if(indicePlaylist == -1) {
		printf("Playlist não encontrada!\n");
		return;
	}
	for(int i = indicePlaylist; i < quantidadePlaylist-1; i++) {
		playlists[i] = playlists[i+1];
	}
	quantidadePlaylist--;
	playlists = realloc(playlists, sizeof(Playlist)*quantidadePlaylist);
	printf("Playlist deletada com sucesso!\n");
}

int main() {
	int opcao;
	while(1) {
		printf("1 - Criar playlist\n");
		printf("2 - Inserir música na playlist\n");
		printf("3 - Pesquisar uma música\n");
		printf("4 - Listar todas as músicas de uma playlist\n");
		printf("5 - Deletar uma música\n");
		printf("6 - Deletar playlist\n");
		printf("7 - Sair\n");
		printf("Digite a opção escolhida: ");
		scanf("%d", &opcao);
		switch(opcao) {
			case 1:
				criarPlaylist();
				break;
			case 2:
				inserirMusica();
				break;
			case 3:
				pesquisarMusica();
				break;
			case 4:
				listarMusicas();
				break;
			case 5:
				deletarMusica();
				break;
			case 6:
				deletarPlaylist();
				break;
			case 7:
				return 0;
			default:
				printf("Opção inválida!\n");
		}
	}
	return 0;
}