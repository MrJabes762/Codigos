package br.edu.ifba.saj.ads.poo;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private Mochila mochila1;

    public Mochila getMochila1() {
        return mochila1;
    }

    public void setMochila1(Mochila mochila1) {
        this.mochila1 = mochila1;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public boolean adicionarLivronamochiladoaluno(Livro livro) {
        if (mochila1.adicionarLivro(livro, 1)){
            return true;
        }
        return false;
    }
}
