package algoritmosdeEleicaoBully;

import algoritmosdeEleicaoBully.exceptions.EventoLimiteExecption;
import algoritmosdeEleicaoBully.model.No;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaDeAlgoritmoDeEleicao {

    private int contadorDeEventos;
    private No noCordenador;
    private List<No> listaDeNos;
    private Random rand;

    public SistemaDeAlgoritmoDeEleicao() {
        setContadorDeEventos(0);
        setNoCordenador(null);
        setListaDeNos(new ArrayList());
        setRand(new Random());
    }

    public String adicionarNo(No no) {
        getListaDeNos().add(no);
        No.idCont++;
        return "Nó Criado e Adiconado a lista: " + getListaDeNos().get(no.getIdLocal()).toString();
    }

    public No getNo(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNo'");
    }

    public void setCoordenador() {
        int maiorIdentificador = 0;
        for (No no : getListaDeNos()) {
            if (no.getIdentificador() > maiorIdentificador) {
                maiorIdentificador = no.getIdentificador();
                no.setIsCoordenador(true);
                setNoCordenador(no);
            }
        }
    }

    public void eventoOcorre() throws EventoLimiteExecption {
        if (getContadorDeEventos() >= 3) {
            throw new EventoLimiteExecption("Passamos da contagem de eventos sera necessario uma nova Eleição");
        }else{
            setContadorDeEventos(contadorDeEventos + 1);
            getListaDeNos().forEach(no -> no.setIdentificador(no.getIdentificador() * getRand().nextInt(1000)));//Simulando a aleatoriedade do maior identificador
        }

    }

    public void notificacao() {

    }

    public void removeCoordenador() {
        getListaDeNos().remove(getNoCordenador().getIdLocal());
        setCoordenador();
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

    public No getNoCordenador() {
        return this.noCordenador;
    }

    public void setNoCordenador(No noCordenador) {
        this.noCordenador = noCordenador;
    }

}
