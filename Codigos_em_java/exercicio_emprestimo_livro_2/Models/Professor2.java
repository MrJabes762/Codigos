package Exercicios.exercicio_emprestimo_livro_2.Models;

import Exercicios.exercicio_emprestimo_livro_2.Data.Mochilha2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Excepitions.Livroexception;

public class Professor2 extends Pessoa implements Operacoes{
    private Mochilha2 mochilaAluno;
    
    public Professor2(String nome, String matricula) {
        super(nome,matricula);
        setMochilaProfessor();
    }
    public Mochilha2 getMochilaProfessor () {
        return mochilaAluno;
    }
    private void setMochilaProfessor() {
        this.mochilaAluno = new Mochilha2();
    }
    public void adicionarLivronaMochila(Livro2 pegarLivro2daestante) {
        try {
            getMochilaProfessor ().adicionarNaMochila(pegarLivro2daestante);
        } catch (Livroexception e) {
            System.out.println(e.getMessage());
        }
    }
    public Livro2 removerLivrodaMochila(String codigo) {
        try {
           return getMochilaProfessor ().pegarLivronaMochila(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
