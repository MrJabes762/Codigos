package br.edu.ifba.saj.ads.poo;

public class Livro {
    private String Nome;
    private String Genero;
    private int Volume;
    private String codigo;
    private Autor autor;

    public Livro(String Nome, String Genero, int Volume, String codigo, Autor autor) {
        setNome(Nome);
        setGenero(Genero);
        setVolume(Volume);
        setCodigo(codigo);
        setAutor(autor);
    }
    public String getNome() {
        return Nome;
    }

    public String getGenero() {
        return Genero;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public int getVolume() {
        return this.Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public boolean equals (Livro outroLivro) {
        return this.codigo.equals(outroLivro.getCodigo());
    }
}
