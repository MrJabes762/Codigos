package model;

public class ContaCorrente implements Operacoes{
    private float valorOperacao;
    private String operacao;
    private Conta conta;

    public ContaCorrente(Conta conta){
        setValorOperacao(0);
        setOperacao("");
        setConta(conta);
        System.out.println("Conta Corrente Criada Com sucesso ");
    }
    @Override
    public void deposita(float valorOperacao) throws OperacaoIrregularExceptions {
        setValorOperacao(valorOperacao);   
        setOperacao("Deposito");
        if (getValorOperacao() <= 0){
            throw new OperacaoIrregularExceptions("Operação Não foi Realizada devido ao valor da Operacao ser invalido");
        }else{
            getConta().setSaldo(getConta().getSaldo() + getValorOperacao());
        }
    }

    @Override
    public void saca(float valorOperacao) throws OperacaoIrregularExceptions{
        setValorOperacao(valorOperacao);
        setOperacao("Saque");
        if (getValorOperacao() > getConta().getSaldo()){
            if (getConta().getSaldo() == 0){
                throw new OperacaoIrregularExceptions("A Operação não pode ser concluida porque não há saldo na conta");
            }
            throw new OperacaoIrregularExceptions("A Operação de Saque não pode ser realizada devido ao Valor Informado ser Maior que o Saldo Da Conta ");
        }else if (getValorOperacao() == 0) {
            throw new OperacaoIrregularExceptions("valor da Operaçao é zero");
        }else{
            getConta().setSaldo(getConta().getSaldo() - getValorOperacao());
        }
    }
    private float getValorOperacao() {
        return this.valorOperacao;
    }

    public void setValorOperacao(float valorOperacao) {
        this.valorOperacao = valorOperacao;
    }
    private String getOperacao() {
        return this.operacao;
    }

    private void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        if (getConta().getSaldo() == 0){
            return getConta().toString();
        } else{
            return " Operação "+ getOperacao() + ", Valor da Operacao "+ getValorOperacao() + getConta().toString();
        }
    }
}

    