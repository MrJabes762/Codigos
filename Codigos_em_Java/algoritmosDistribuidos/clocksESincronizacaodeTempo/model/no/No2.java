package model.no;

import model.Mensagem;

public class No2 extends No {
    private Mensagem messagem;
    private static int contadorlocal2;

    public No2() {
        setContadorlocal2(getContador());
        setMessagem(new Mensagem());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }

    public int getContadorlocal2() {
        return contadorlocal2;
    }

    public void setContadorlocal2(int contadorlocal2) {
        this.contadorlocal2 = contadorlocal2;
    }
}
