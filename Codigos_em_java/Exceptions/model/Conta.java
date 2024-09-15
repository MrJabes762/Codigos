package model;
import java.util.Objects;

public class Conta {
    private String nome;
    private String cpf;
    private float saldo;
    private String chaveDeSeguranca;
    public Conta(String nome, String cpf, float saldo, String token) throws CriacaoDeContasException {
        if((nome == null) || (cpf == null) || (token == null)){
            throw new CriacaoDeContasException("Campos de Nome ou Cpf ou Chave de Segurança estão nulos");
        }else if ((Objects.equals(nome, "")) || (Objects.equals(cpf,"")) || (Objects.equals(token, ""))){
            throw new CriacaoDeContasException("Canpos de Nome ou Cpf ou Token estão Vazios");
        }else if (cpf.length() < 11){
            throw new CriacaoDeContasException("Cpf Inválido");
        }else{
            setNome(nome);
            setCpf(cpf);
            setSaldo(saldo);
            setChaveDeSeguranca(token);
            System.out.println("Conta Criada Con Sucesso");
        }
    }
    

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getChaveDeSeguranca() {
        return this.chaveDeSeguranca;
    }

    public void setChaveDeSeguranca(String chaveDeSeguranca) {
        this.chaveDeSeguranca = chaveDeSeguranca;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { 
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conta outraConta = (Conta) obj;
        return Objects.equals(this.getCpf(), outraConta.getCpf());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.getCpf());
    }
    @Override
    public String toString() {
        return " {" +
            " Nome='" + getNome() + "'" +
            ", Cpf='" + getCpf() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }
    
}
