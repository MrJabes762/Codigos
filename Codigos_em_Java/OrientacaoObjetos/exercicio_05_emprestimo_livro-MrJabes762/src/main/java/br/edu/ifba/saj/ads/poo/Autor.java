package br.edu.ifba.saj.ads.poo;

public class Autor {
    private String nome;
    private String email;
    private String Cpf;
    public Autor(String nome, String email, String Cpf) {
        setNome(nome);
        setCpf(Cpf);
        setEmail(email);
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return this.Cpf;
    }
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
}
