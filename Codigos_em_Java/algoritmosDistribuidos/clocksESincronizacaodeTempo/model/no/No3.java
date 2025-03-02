package model.no;

import model.Mensagem;

public class No3 extends No {
    private Mensagem messagem;
    private static int contadorlocal3;

    public No3() { 
        setContadorlocal3(getContador());
        setMessagem(new Mensagem ());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }
    public static int getContadorlocal3() {
        return contadorlocal3;
    }

    public static void setContadorlocal3(int contadorlocal3) {
        No3.contadorlocal3 = contadorlocal3;
    }
}
