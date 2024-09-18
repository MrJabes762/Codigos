public class ContaCorrente extends Conta implements Operacoes{
    private float valorOperacao;

    public ContaCorrente(float saldo, float valorOperacao) {
        super(saldo);
        setValorOperacao(valorOperacao);
    }

    private float getValorOperacao() {
        return this.valorOperacao;
    }

    private void setValorOperacao(float valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    @Override
    public void deposita(float valorOperacao) throws OperacaoIrregularExceptions {
        setValorOperacao(valorOperacao);   
        if (getValorOperacao() < 0){
            throw new OperacaoIrregularExceptions("Operação Não foi Realizada devido ao valor da Operacao ser negativo");
        }else{
            setSaldo(getSaldo() + getValorOperacao());
        }
    }

    @Override
    public void saca(float valorOperacao) throws OperacaoIrregularExceptions{
        setValorOperacao(valorOperacao);
        if (getValorOperacao() > getSaldo()){
            if (getSaldo() == 0){
                throw new OperacaoIrregularExceptions("A Operação não pode ser concluida porque não há saldo na conta");
            }
            throw new OperacaoIrregularExceptions("A Operação de Saque não pode ser realizada devido ao Valor Informado ser Maior que o Saldo Da Conta ");
        }else{
            setSaldo(getSaldo() - getValorOperacao());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
