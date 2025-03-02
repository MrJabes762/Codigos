package model.no;

import model.Mensagem;

public class No1 extends No{

    private Mensagem messagem;
    private static int contadorlocal1;

    public No1() {
        setContadorlocal1(getContador());
        setMessagem(new Mensagem ());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }

    public static int getContadorlocal1() {
        return contadorlocal1;
    }

    public static void setContadorlocal1(int contadorlocal1) {
        No1.contadorlocal1 = contadorlocal1;
    }
}
