package services;

import data.ArgumentoIrregullarException;
import data.BancoDeContasCorrentes;
import data.ContaDuplicadaException;
import java.util.HashMap;
import model.ContaCorrente;

public class BancoServices {

    public static void create (ContaCorrente conta) throws ContaDuplicadaException, ArgumentoIrregullarException{
        verificarAConta (conta);
        BancoDeContasCorrentes.adicionarConta(conta);
    }
    private static void verificarAConta(ContaCorrente conta) throws ContaDuplicadaException, ArgumentoIrregullarException {
        if(BancoDeContasCorrentes.isContaDuplicada(conta)){
            throw new ContaDuplicadaException("Essa Conta Ja Existe");
        }
    }
    public static HashMap<String,ContaCorrente> getLista (){
        return BancoDeContasCorrentes.getLista();
    }
    public static void update (ContaCorrente conta){
        BancoDeContasCorrentes.adicionarConta(conta);
    }
    public static void remove(String chaveDeSegurança, ContaCorrente conta) throws ArgumentoIrregullarException{
        BancoDeContasCorrentes.removerConta(chaveDeSegurança, conta);
    }
}
