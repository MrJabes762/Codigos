package Exercicios.exercicio_emprestimo_livro_2.Models;

public interface Operacoes {
    public abstract void adicionarLivronaMochila (Livro2 livro);
    public abstract Livro2 removerLivrodaMochila (String codigo);
}
