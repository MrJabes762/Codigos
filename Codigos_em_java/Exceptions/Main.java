
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente (5000, 0);
        System.out.println("Saldo da Conta Inicial  = " + conta);
        /*try {
            conta.deposita(1000);
            System.out.println(conta);
            conta.deposita(6000); // operação normal 
            //conta.deposita(-6000);// Exceçao com numero negativo
            System.out.println(conta);
            conta.saca(12000);
            System.out.println(conta);
            //conta.saca(1000); // demosntração não há saldo na conta
            conta.deposita(1000);
            System.out.println(conta);
            //conta.saca(2000); // denstração do valor ser maior que o saldo da conta 
            //System.out.println(conta);
        } catch (OperacaoIrregularExceptions e) {
            System.out.println(e);
        }*/
    }
}
