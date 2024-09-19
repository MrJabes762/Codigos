package model;
import java.util.Objects;

public class Conta {
    private String nome;
    private String cpf;
    private float saldo;
    private String senha;
    public Conta(String nome, String cpf, float saldo, String senha) throws CriacaoDeContasException {
        if((nome == null) || (cpf == null) || (senha == null)){
            throw new CriacaoDeContasException("Campos de Nome ou Cpf ou Chave de Segurança estão nulos");
        }else if ((nome.isEmpty()) || (cpf.isEmpty()) || (senha.isEmpty())){
            throw new CriacaoDeContasException("Canpos de Nome ou Cpf ou semha estão Vazios");
        }else if (cpf.length() < 11){
            throw new CriacaoDeContasException("Cpf Inválido");
        }else{
            setNome(nome);
            setCpf(cpf);
            setSaldo(saldo);
            setChaveDeSeguranca(senha);
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
        return this.senha;
    }

    public void setChaveDeSeguranca(String senha) {
        this.senha = senha;
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
