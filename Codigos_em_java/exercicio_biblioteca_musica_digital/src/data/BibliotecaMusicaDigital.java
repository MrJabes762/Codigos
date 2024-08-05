package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import model.Musica;


public class BibliotecaMusicaDigital implements BibliotecaMusicaDigitalOperacoes {
    private List<Musica> listaMusica;
    private List<List<Musica>> bancoDeListasdeProducoes;

    @Override
    public void adicionarMusicaAListaReproducao(Musica musica) throws BibliotecaException {
        if (!getBancoDeListasdeProducoes().contains(getListaMusica())) {
            getBancoDeListasdeProducoes().add(getListaMusica());
        }else{
            throw new BibliotecaException ("Essa Lista Ja existe");
        }
        if (!getListaMusica().contains(musica)) {
            getListaMusica().add(musica);
        } else {
            throw new BibliotecaException ("Esta musica já está na lista");
        }
    }

    @Override
    public void removerMusicaListaReproducao(Musica musica) {
        getListaMusica().removeIf(musicaquevairemover -> Objects.equals(musicaquevairemover,musica));
    }

    @Override
    public Musica reproduzirMusica(Musica musica) {
        for (Musica musicadereproducao : getListaMusica()) {
            if (Objects.equals(musicadereproducao, musica)) {
                return musicadereproducao;
            }
        }
        return null; // Ou lance uma exceção se preferir
    }
    
    public List<Musica> getListaMusica() {
        return this.listaMusica;
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }

    public List<List<Musica>> getBancoDeListasdeProducoes() {
        return this.bancoDeListasdeProducoes;
    }

    @Override
    public String toString() {
        return "{"+
            ", bancoDeListasdeProducoes='" + getBancoDeListasdeProducoes() + "'" +
            "}";
    }

    @Override
    public int duracaoTotal() {
        int duracaoLista = 0;
        for (Musica musica : getListaMusica()) {
            duracaoLista += musica.getDuracao();
        }
        return duracaoLista;
    }
    
}
