package Exercicios.exercicio_emprestimo_livro_2.Models;

public class Pessoa {
    private String nome;
    private String matricula;
    public Pessoa(String nome, String matricula) {
        setMatricula(matricula);
        setNome (nome);
    }
    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
