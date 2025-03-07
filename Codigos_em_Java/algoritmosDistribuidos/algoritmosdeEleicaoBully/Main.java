package algoritmosdeEleicaoBully;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;

public class Main {

    public static void main(String[] args) {
        SistemaDeAlgoritmoDeEleicao algoritmo = new SistemaDeAlgoritmoDeEleicao();
        System.out.println(algoritmo.adicionarNo(new No("Trabalho", 500)));// o identificador incrementa
        System.out.println(algoritmo.adicionarNo(new No("Casa", 10)));
        System.out.println(algoritmo.adicionarNo(new No("Escritorio", 100)));
        System.out.println(algoritmo.setCoordenador());//Ele vai setar o coordenador navegando pela lista e pegar o Identificador mais alto
        System.out.println(" ------>  Lista de Nos <----");
        System.out.println(algoritmo.getListaDeNos());
        System.out.println(" ------>  Lista de Nos <----");
        try {
            System.out.println(algoritmo.eventoOcorre());//ao setar o coordenador, eventos vao ocorrer
            System.out.println(algoritmo.eventoOcorre());
            System.out.println(algoritmo.eventoOcorre());
            System.out.println(algoritmo.eventoOcorre());// o limitador vai ate 3 eventos ao chegar nesse ele vai estourar a excessão
        } catch (EventoLimiteExecption e) {
            System.out.println(e.getMessage());
            System.out.println(algoritmo.setCoordenador());
            System.out.println(" ------>  Lista de Nos <----");
            System.out.println(algoritmo.getListaDeNos());
            System.out.println(" ------>  Lista de Nos <----");
        }
        System.out.println("-> Ouve uma falha no Coordenador " + algoritmo.coordenadorSaiuDoAr().getNome());
        System.out.println(algoritmo.setCoordenador());
        System.out.println(" ------>  Lista de Nos <----");
        System.out.println(algoritmo.getListaDeNos());
        System.out.println(" ------>  Lista de Nos <----");
    }
}
