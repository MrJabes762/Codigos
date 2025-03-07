package algoritmosdeEleicaoBully;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class SistemaDeAlgoritmoDeEleicao {

    private int contadorDeEventos;
    private List<No> listaDeNos;
    private Random rand;
    private int posicaoCordenador;

    public SistemaDeAlgoritmoDeEleicao() {
        setContadorDeEventos(0);
        setListaDeNos(new ArrayList<>());
        setRand(new Random());
    }

    public String adicionarNo(No no) {
        getListaDeNos().add(no);
        No.idCont++;
        return "Nó Criado e Adiconado a lista: " + getListaDeNos().get(no.getIdLocal()).toString();
    }

    public String setCoordenador() {
        if (getListaDeNos().isEmpty()) {
            return "Lista de nós está vazia. Não é possível definir um coordenador.";
        }

        int maiorIdentificador = 0;
        int novaPosicaoCoordenador = -1;

        for (int i = 0; i < getListaDeNos().size(); i++) {
            if (getListaDeNos().get(i).getIdentificador() > maiorIdentificador) {
                maiorIdentificador = getListaDeNos().get(i).getIdentificador();
                novaPosicaoCoordenador = i;
            }
        }

        if (novaPosicaoCoordenador == -1) {
            return "Não foi possível encontrar um novo coordenador.";
        }

        if (getPosicaoCordenador() >= 0 && getPosicaoCordenador() < getListaDeNos().size()) {
            getListaDeNos().get(getPosicaoCordenador()).setIsCoordenador(false);
        }

        setPosicaoCordenador(novaPosicaoCoordenador);
        getCoordenador().setIsCoordenador(true);
        return "No coordenador escolhido com base no Identificador: " 
                    + getCoordenador().getNome()
                    + notificacao();
    }

    public No getNoCordenador(int pos) {
        return getListaDeNos().get(pos);
    }

    public String eventoOcorre() throws EventoLimiteExecption {
        if (getContadorDeEventos() >= 3) {
            throw new EventoLimiteExecption("Passamos do Limite de eventos para a eleição de um novo coordenador");
        } else {
            setContadorDeEventos(contadorDeEventos + 1);
            getListaDeNos().forEach(no -> no.setIdentificador(no.getIdentificador() * getRand().nextInt(10)));//Simulando a aleatoriedade do maior identificador
            return "Ocoreu o " + getContadorDeEventos() + "º evento.";
        }
    }

    private void carregarListaNoVizinhos() {//Metodo de Adicionar vizinhos 
        getCoordenador().getNosVizinhos().clear();// limpando a lista 
        getListaDeNos().forEach(no -> no.setNotificacao(" "));
        for (No no : getListaDeNos()) {
            if (!getCoordenador().getNosVizinhos().contains(no) && !Objects.equals(getCoordenador(), no)) {// Na lista de vizinhos daquele que é igual será verificado se contem o no viznho ele não é igual ao coordenador 
               getCoordenador().getNosVizinhos().add(no);//ai é adicionado
            }
        }
    }

    private String notificacao() {
        carregarListaNoVizinhos();
        getCoordenador()
            .getNosVizinhos()
            .forEach(noVizinho -> noVizinho.setNotificacao("Atenção o No: " + getCoordenador().getNome() + " é o novo coordenador"));
        return " e seus vizinhos  " + getCoordenador().getNosVizinhos().stream().map((v) -> v.getNome()).toList() + " Foram notificados";
    }

    public No coordenadorSaiuDoAr () {
        return getListaDeNos().remove(getCoordenador().getIdLocal());
    }

    private No getCoordenador(){
        return getListaDeNos().get(getPosicaoCordenador());
    }

    public int getContadorDeEventos() {
        return this.contadorDeEventos;
    }

    public void setContadorDeEventos(int contadorDeEventos) {
        this.contadorDeEventos = contadorDeEventos;
    }

    public List<No> getListaDeNos() {
        return this.listaDeNos;
    }

    public void setListaDeNos(List<No> listaDeNos) {
        this.listaDeNos = listaDeNos;
    }

    public Random getRand() {
        return this.rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getPosicaoCordenador() {
        return posicaoCordenador;
    }

    public void setPosicaoCordenador(int posicaoCordenador) {
        this.posicaoCordenador = posicaoCordenador;
    }

}
