import data.BibliotecaException;
import data.BibliotecaMusicaDigital;
import java.util.ArrayList;
import java.util.List;
import model.Musica;

public class RoteiroBibioteca {
    public static void main(String[] args) {
        BibliotecaMusicaDigital biblioteca = new BibliotecaMusicaDigital();
        List<Musica> lista1 = new ArrayList<>();
        List<Musica> lista2 = new ArrayList<>();
        biblioteca.setListaMusica(lista1);
        try {
            biblioteca.adicionarMusicaAListaReproducao(new Musica ("Tudo Nosso Nada deles","Lucas de matos",15));
            biblioteca.adicionarMusicaAListaReproducao(new Musica("SaidiBanba", "BlackStiles", 4));

        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca.getListaMusica());
        System.out.println(biblioteca.duracaoTotal());
        biblioteca.setListaMusica(lista2);
        Musica musica1 = new Musica("Deu A louca em C", "BlackStiles", 7);
        try {
            biblioteca.adicionarMusicaAListaReproducao(new Musica ("È O Bixo","Lucas de matos",24));
            biblioteca.adicionarMusicaAListaReproducao(musica1);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca.getListaMusica());
        System.out.println(biblioteca.reproduzirMusica(musica1));
        biblioteca.removerMusicaListaReproducao(musica1);
        System.out.println(biblioteca.getListaMusica());
        System.out.println(biblioteca);

    }
}
