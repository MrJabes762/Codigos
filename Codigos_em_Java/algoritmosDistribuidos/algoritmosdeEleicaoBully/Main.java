package algoritmosdeEleicaoBully;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;

public class Main {
    public static void main(String[] args) {
        SistemaDeAlgoritmoDeEleicao algoritmo = new SistemaDeAlgoritmoDeEleicao ();
        System.out.println(algoritmo.adicionarNo(new No("Trabalho", 50)));// o identificador incrementa
        System.out.println(algoritmo.adicionarNo(new No("Casa",1000)));
        System.out.println(algoritmo.adicionarNo(new No("Escritorio",100)));
        System.out.println("Lista de Nos: ");
        System.out.println(algoritmo.getListaDeNos());
        algoritmo.setCoordenador();//Ele vai setar o coordenador navegando pela lista e pegar o Identificador mais alto
        System.out.println("No coordenador escolhido com base no Identificador: " + algoritmo.getNoCordenador());
        try {
            algoritmo.eventoOcorre();//ao setar o coordenador, eventos vao ocorrer
            algoritmo.eventoOcorre();
            algoritmo.eventoOcorre();
            algoritmo.eventoOcorre();// o limitador vai ate 3 eventos ao chegar nesse ele vai estourar a excessão
        } catch (EventoLimiteExecption e) {
            System.out.println(e.getMessage());
            System.out.println("Lista de Nos: ");
            System.out.println(algoritmo.getListaDeNos());
            algoritmo.setCoordenador();
            System.out.println("No coordenador escolhido com base no Identificador: " + algoritmo.getNoCordenador());
        }
        //algoritmo.notificacao();
        //algoritmo.removeCoordenador(); // Simulacao de falha algum coordenador sai do ar ou do sistema isso é a remocao ele deve procurar outro
        //System.out.println();
    }
}
