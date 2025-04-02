package Exercicios.exercicio_emprestimo_livro_2;

import Exercicios.exercicio_emprestimo_livro_2.Data.Biblioteca2;
import Exercicios.exercicio_emprestimo_livro_2.Data.Mochilha2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Aluno2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Autor2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Livro2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Professor2;
import Exercicios.exercicio_emprestimo_livro_2.Models.Excepitions.Livroexception;

public class Roteiro {
    public static void main(String[] args) throws Livroexception {
        Biblioteca2 biblioteca = new Biblioteca2();
        Autor2 autor1 = new Autor2 ("Jose", "jose@seila.com", "123.456.789.-11");
        biblioteca.adicionarLivro(new Livro2 ("Java 1", "Livro2  sobre java", 10, "123-4565-15", autor1));
        biblioteca.adicionarLivro(new Livro2 ("Java 2", "Livro2  sobre java", 10, "123-4565-25", autor1));
        biblioteca.adicionarLivro(new Livro2 ("Java 3", "Livro2  sobre java", 10, "123-4565-35", autor1));
        biblioteca.adicionarLivro(new Livro2 ("Java 4", "Livro2  sobre java", 10, "123-4565-45", autor1));
        biblioteca.adicionarLivro(new Livro2 ("Java 5", "Livro2  sobre java", 10, "123-4565-55",
                new Autor2("Jose 2", "jose@seila.com", "123.456.789.-22")));
        biblioteca.adicionarLivro(new Livro2 ("Java 6", "Livro2  sobre java", 10, "123-4565-65", autor1));
        biblioteca.adicionarLivro(new Livro2 ("Java 7", "Livro2  sobre java", 10, "123-4565-75", autor1));
        Aluno2 aluno = new Aluno2("Jabes", "20192TADSSAJ0014");
        biblioteca.solicitaEmprestimo(aluno, "123-4565-55");
        biblioteca.solicitaEmprestimo(aluno, "123-4565-65");
        biblioteca.solicitaEmprestimo(aluno, "123-4565-75");
        System.out.println(aluno);
        biblioteca.soliticaDevolucao(aluno, "123-4565-55");
        System.out.println(aluno);

        Professor2 professor = new Professor2 ("Alberto", "2029TADSRSQJ0015");
        biblioteca.soliticaEmprestimo(professor, "123-4565-55");
        System.out.println(professor.toString());
        biblioteca.solicitaEmprestimo(aluno, "123-4565-55");
        System.out.println(aluno.toString());
    }
}
