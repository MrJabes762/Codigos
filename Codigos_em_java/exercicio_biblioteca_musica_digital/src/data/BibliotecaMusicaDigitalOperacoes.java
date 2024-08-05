package data;
import model.Musica;
public interface BibliotecaMusicaDigitalOperacoes{
    public abstract void adicionarMusicaAListaReproducao (Musica musica) throws BibliotecaException;
    public abstract void removerMusicaListaReproducao (Musica musica);
    public abstract Musica reproduzirMusica (Musica musica);
    public abstract int duracaoTotal();
}
/*Biblioteca de Música Digital: Crie um sistema para gerenciar uma biblioteca de música digital.
 Os usuários podem criar listas de reprodução, cada uma contendo várias músicas. Cada música tem informações, como título, artista e duração. 
 Os usuários podem adicionar e remover músicas de suas listas de reprodução e reproduzir as músicas em suas listas.
 Implemente funcionalidades para listar as músicas em uma lista de reprodução, calcular a duração total da lista de reprodução e reproduzir músicas. */