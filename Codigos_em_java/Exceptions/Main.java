import data.ArgumentoIrregullarException;
import data.ContaDuplicadaException;
import model.Conta;
import model.ContaCorrente;
import model.CriacaoDeContasException;
import model.OperacaoIrregularExceptions;
import services.BancoServices;

public class Main {
    public static void limparConsole() {
        try {
            // Verifica o sistema operacional e executa o comando adequado
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            limparConsole();
           //Conta conta = new Conta (null,null,0,null);//Demonstração de Campos nulos 
           //Conta conta1 = new Conta ("","",0,"");//Demonstração de Campos Vazios
           //Conta conta2 = new Conta("Pedro", "12345678", 0, "Seila12345@"); // Demonstração Cpf Invalido
           Conta conta3 = new Conta ("Pedro", "12345678911",0,"Seila1234@");
           Conta conta4 = new Conta ("Pedro", "12345678911",0,"Seila1234@");// Exemplo da conta duplicada 
           Conta conta5 = new Conta ("João",  "03143275607", 0, "@chave10");
           ContaCorrente conta31 = new ContaCorrente(conta3);
           ContaCorrente conta41 = new ContaCorrente(conta4);// Exemplo Da Conta Duplicada 
           ContaCorrente conta51 = new ContaCorrente(conta5);
           BancoServices.create(conta31);
           //BancoServices.create(conta41);//Demonstração de Contas Duplicadas
           BancoServices.create(conta51);
           BancoServices.getLista().get("Seila1234@").deposita(1200);// A chave tem que ser Exatamente igual 
           System.out.println(BancoServices.getLista().get("Seila1234@"));
           //BancoServices.getLista().get("Seila1234@").deposita(0);// Demonstração de operações invalidas com valores menor que zero ou = a 0
           BancoServices.getLista().get("@chave10").deposita(1000);
           System.out.println(BancoServices.getLista().get("@chave10"));
           //BancoServices.getLista().get("@chave10").saca(1200);// Demonstração O valor é maior que o saldo da conta
           BancoServices.getLista().get("@chave10").saca(1000);
           System.out.println(BancoServices.getLista().get("@chave10"));
           //BancoServices.getLista().get("@chave10").saca(10);// Demonstração de Saque quando não há saldo na conta 
           System.out.println(BancoServices.getLista());
        }catch (CriacaoDeContasException e){
            System.out.println(e);
        }catch  (ContaDuplicadaException e ){
            System.out.println(e);
        }catch (ArgumentoIrregullarException e){
            System.out.println(e);
        }catch(OperacaoIrregularExceptions e){
            System.out.println(e);
        }
    
    }
}
