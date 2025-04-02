package br.edu.ifba.saj.ads.poo;

public class Professor {
    private Livro livro;
    private String nomeProfessor;
    private String matriculaProfessor;
    private Mochila mochila;

    public Livro getLivro() {
        return livro;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    public String getNomeProfessor() {
        return nomeProfessor;
    }


    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }


    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }


    public Mochila getMochila() {
        return mochila;
    }


    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
    public boolean adicionarLivronaMochiladoProfessor(Livro livrodaestante) {
        if (mochila.adicionarLivro(livrodaestante,2)){
            return true;
        }
        return false;
    }

}
