package data;
import java.util.HashMap;

import java.util.Iterator;
import model.ContaCorrente;

public class BancoDeContasCorrentes {
    private static HashMap<String,ContaCorrente> lista = new HashMap<>();

    public static void adicionarConta(ContaCorrente conta){
        getLista().put(conta.getConta().getChaveDeSeguranca(), conta);
        System.out.println("Salva Com sucesso no banco ");
    }
    
    public static boolean isContaDuplicada(ContaCorrente conta) throws ArgumentoIrregullarException {
        Iterator<ContaCorrente> iterador = getLista().values().iterator();
        while (iterador.hasNext()) {
            ContaCorrente contaAtual = iterador.next();
            if (contaAtual.getConta().equals(conta.getConta())) {
                return true;
            }
        }
        return false;
    }
    
    public static ContaCorrente getConta (String token){
        return getLista().get(token);
    }
    public static void removerConta (String chaveDeSeguranca, ContaCorrente conta) throws ArgumentoIrregullarException{
        if(getLista().remove(chaveDeSeguranca,conta)){
            System.out.println("Conta Removida com Sucesso");
        }else{
            throw new ArgumentoIrregullarException ("Verifique se a chave ou  ");
        }
    }
    public static HashMap<String,ContaCorrente> getLista() {
        return BancoDeContasCorrentes.lista;
    }

    private void setLista(HashMap<String,ContaCorrente> lista) {
        BancoDeContasCorrentes.lista = lista;
    }
    @Override
    public String toString() {
        return "{" +
            " lista='" + getLista();
    }

}
