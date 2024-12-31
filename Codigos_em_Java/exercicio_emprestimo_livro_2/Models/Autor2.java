package Exercicios.exercicio_emprestimo_livro_2.Models;

public class Autor2 {
    private String nome;
    private String email;
    private String cpf;

    public Autor2(String nome, String email, String cpf) {
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
    }
    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
