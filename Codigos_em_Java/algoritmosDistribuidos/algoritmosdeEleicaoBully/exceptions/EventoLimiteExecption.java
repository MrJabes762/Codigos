package algoritmosdeEleicaoBully.exceptions;

//Classe que representa um tipo de exceção customizada herdando de exceptions 
public class EventoLimiteExecption extends Exception{
    public EventoLimiteExecption (String mensagem){
        super(mensagem);
    }
}
