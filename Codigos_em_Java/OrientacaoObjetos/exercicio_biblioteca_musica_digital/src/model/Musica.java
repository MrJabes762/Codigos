package model;

public class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int i) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = i;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return this.duracao;
    }
    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", artista='" + getArtista() + "'" +
            ", duracao='" + getDuracao() + "'" +
            "}";
    }
}
