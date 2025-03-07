package algoritmosdeEleicaoBully;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;
import algoritmosdeEleicaoBully.service.SistemaDeAlgoritmoDeEleicao;

public class Main {

    public static void main(String[] args) {
        //Estanciando o sistema 
        SistemaDeAlgoritmoDeEleicao algoritmo = new SistemaDeAlgoritmoDeEleicao();

        //Criação e acição de alguns exemplos de nós 
        System.out.println(algoritmo.adicionarNo(new No("Trabalho", 500)));// o identificador incrementa
        System.out.println(algoritmo.adicionarNo(new No("Casa", 10)));
        System.out.println(algoritmo.adicionarNo(new No("Escritorio", 100)));

        //Com base nos objetos setados inicalmente ele procurará o coordenador 
        //Ele vai setar o coordenador navegando pela lista e pegar o Identificador mais alto
        System.out.println(algoritmo.setCoordenador());
        //Exibindo a lista de nós
        System.out.println(" ------>  Lista de Nos <----");
        System.out.println(algoritmo.getListaDeNos());
        System.out.println(" ------>  Lista de Nos <----");
        try {
            //ao setar o coordenador, eventos vao ocorrer no maximo a simulação de 3 eventos 
            System.out.println(algoritmo.eventoOcorre());
            System.out.println(algoritmo.eventoOcorre());
            System.out.println(algoritmo.eventoOcorre());
            // o limitador vai ate 3 eventos ao chegar nesse ele vai estourar a excessão
            System.out.println(algoritmo.eventoOcorre());
        } catch (EventoLimiteExecption e) {
            // tratambento para o tipo de exceção de um evento para que seja feita a troca
            System.out.println(e.getMessage());
            System.out.println(algoritmo.setCoordenador());
            System.out.println(" ------>  Lista de Nos <----");
            System.out.println(algoritmo.getListaDeNos());
            System.out.println(" ------>  Lista de Nos <----");
        }
        //Simulação de falha do coordenador - ele saindo do ar 
        System.out.println("-> Ouve uma falha no Coordenador " + algoritmo.coordenadorSaiuDoAr().getNome());
        //buscando outro coordenador 
        System.out.println(algoritmo.setCoordenador());
        //exibindo a lista
        System.out.println(" ------>  Lista de Nos <----");
        System.out.println(algoritmo.getListaDeNos());
        System.out.println(" ------>  Lista de Nos <----");
    }
}
