package model.no;

import model.Mensagem;

public class No3 extends ClockGeral {
    private Mensagem messagem;
    private int contadorlocal3;

    public No3() { 
        setContadorlocal3(getContador());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }

    public int getContadorlocal3() {
        return contadorlocal3;
    }

    public void setContadorlocal3(int contadorlocal3) {
        this.contadorlocal3 = contadorlocal3;
    }
    
}
