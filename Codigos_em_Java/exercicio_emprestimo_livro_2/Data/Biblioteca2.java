package Exercicios.exercicio_emprestimo_livro_2.Data;

import Exercicios.exercicio_emprestimo_livro_2.Models.Aluno2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Livro2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Professor2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Excepitions.Livroexception;
public class Biblioteca2 {
    private Estante2 estantedabiblioteca;
    
    public Biblioteca2() {
        setEstantedabiblioteca();
    }
    public void adicionarLivro(Livro2 livro2) throws Livroexception {
        try {
            getEstantedabiblioteca().adicionarLivronaestante(livro2);
        } catch (Livroexception e) {
           System.out.println(e.getMessage ());
        }
    }
    public void solicitaEmprestimo(Aluno2 aluno, String codigo) {
        try {
            aluno.adicionarLivronaMochila(getEstantedabiblioteca().pegarLivro2daestante(codigo));
        } catch (Livroexception e){
            System.out.println(e.getMessage());
        }
    }
    public void soliticaDevolucao(Aluno2 aluno, String codigo) throws Livroexception {
        getEstantedabiblioteca().adicionarLivronaestante(aluno.removerLivrodaMochila(codigo));
    }
    public void soliticaEmprestimo(Professor2 professor, String codigo) {
        try {
            professor.adicionarLivronaMochila(getEstantedabiblioteca().pegarLivro2daestante(codigo));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Estante2 getEstantedabiblioteca() {
        return this.estantedabiblioteca;
    }

    public void setEstantedabiblioteca() {
        this.estantedabiblioteca = new Estante2();
    }
}
