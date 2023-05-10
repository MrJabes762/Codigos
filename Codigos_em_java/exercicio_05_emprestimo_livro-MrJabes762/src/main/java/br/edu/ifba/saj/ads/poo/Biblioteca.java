package br.edu.ifba.saj.ads.poo;

public class Biblioteca {
    private Estante estante;
    private Mochila mochila;
    private Livro livrodapesquisa;

    public Biblioteca() {
        this.estante = new Estante();
        this.mochila = new Mochila();
        this.livrodapesquisa = null;
    }
    private void setLivrodapesquisa (Livro livrodapesquisa) {
        this.livrodapesquisa = livrodapesquisa;
    }
    private Livro getLivrodapesquisa () {
        return this.livrodapesquisa;
    }
    public boolean solicitaEmprestimo(Aluno aluno, String codigoLivro) {//implementado
        setLivrodapesquisa (estante.getLivroEstante(codigoLivro));
        if ((getLivrodapesquisa () != null) && (this.mochila.isMochilanaocheia(1))){
            if(aluno.adicionarLivronamochiladoaluno(getLivrodapesquisa())){
                if(estante.tiraLivrodaEstante(getLivrodapesquisa())){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean soliticaDevolucao(Aluno aluno, String codigoLivro) {//implementado
        setLivrodapesquisa(mochila.getLivroMochila(codigoLivro));
        if ((getLivrodapesquisa() != null) && (this.estante.AddLivroEstante(getLivrodapesquisa()))){
            if (mochila.tiraLivrodaMochila (getLivrodapesquisa())){
                return true;
            }
        }
        return false;
    }
    public boolean adicionarLivro(Livro livro) {//implementado
        if (livro != null) {
            estante.AddLivroEstante(livro);
            return true;
        }
        return false;
    }
    public boolean soliticaEmprestimo(Professor professor, String codigoLivro) {//implementado
        setLivrodapesquisa (estante.getLivroEstante(codigoLivro));
        if ((getLivrodapesquisa () != null) && (this.mochila.isMochilanaocheia(2))){
            if(professor.adicionarLivronaMochiladoProfessor(getLivrodapesquisa())){
                if(estante.tiraLivrodaEstante(getLivrodapesquisa())){
                    return true;
                }
            }
        }
        return false;
    }
}
