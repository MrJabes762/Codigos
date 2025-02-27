package model.no;

import model.Mensagem;

public class No1 extends ClockGeral{
    private Mensagem messagem;
    private int contadorlocal1;

    public No1() {
        setContador(getContador());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }

    public int getContadorlocal1() {
        return contadorlocal1;
    }

    public void setContadorlocal1(int contadorlocal1) {
        this.contadorlocal1 = contadorlocal1;
    }
}
