package br.edu.ifba.saj.ads.poo;

public class Acoes {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor1 = new Autor("Jose", "jose@seila.com", "123.456.789.-11");
        biblioteca.adicionarLivro(new Livro("Java 1", "Livro sobre java", 10, "123-4565-15", autor1));
        biblioteca.adicionarLivro(new Livro("Java 2", "Livro sobre java", 10, "123-4565-25", autor1));
        biblioteca.adicionarLivro(new Livro("Java 3", "Livro sobre java", 10, "123-4565-35", autor1));
        biblioteca.adicionarLivro(new Livro("Java 4", "Livro sobre java", 10, "123-4565-45", autor1));
        biblioteca.adicionarLivro(new Livro("Java 5", "Livro sobre java", 10, "123-4565-55",
                new Autor("Jose 2", "jose@seila.com", "123.456.789.-22")));
        biblioteca.adicionarLivro(new Livro("Java 6", "Livro sobre java", 10, "123-4565-65", autor1));
        biblioteca.adicionarLivro(new Livro("Java 7", "Livro sobre java", 10, "123-4565-75", autor1));

        Aluno aluno = new Aluno();
        biblioteca.solicitaEmprestimo(aluno, "123-4565-55");
        biblioteca.solicitaEmprestimo(aluno, "123-4565-65");
        biblioteca.solicitaEmprestimo(aluno, "123-4565-75");
        System.out.println(aluno);
        biblioteca.soliticaDevolucao(aluno, "123-4565-55");
        System.out.println(aluno);

        Professor professor = new Professor();
        biblioteca.soliticaEmprestimo(professor, "123-4565-55");
        System.out.println(professor);
        biblioteca.solicitaEmprestimo(aluno, "123-4565-55");
        System.out.println(aluno);
    }
}
