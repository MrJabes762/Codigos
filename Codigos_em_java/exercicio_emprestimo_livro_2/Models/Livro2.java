package Exercicios.exercicio_emprestimo_livro_2.Models;

public class Livro2 {
    private String nome;
    private String descricao;
    private int volume;
    private String codigo;
    private Autor2 autor1;

    public Livro2(String nome, String descricao, int volume, String codigo, Autor2 autor1) {
        setAutor1(autor1);
        serCodigo(codigo);
        setDescricao(descricao);
        setNome(nome);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Autor2 getAutor1() {
        return autor1;
    }

    public void setAutor1(Autor2 autor1) {
        this.autor1 = autor1;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void serCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                String outroLivroCodigo = (String) obj;
                if (getCodigo().equals(outroLivroCodigo)) {
                    return true;
                }
            } else if (obj instanceof Livro2) {
                Livro2 outrolLivro2 = (Livro2) obj;
                if (this.equals(outrolLivro2)) {
                    return true;
                }
            }
        }
        return false;
    }

}
