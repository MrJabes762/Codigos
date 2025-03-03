package model.no;

import model.Mensagem;
import service.SistemaDistribuidodeClocksESincronizacaoDetempo;

public class No1 extends No{

    private Mensagem messagem;
    private static int contadorlocal1;
    private SistemaDistribuidodeClocksESincronizacaoDetempo sistema;

    public No1(String identificacao) {
        super(identificacao);
        setContadorlocal1(getContador());
        setMessagem(new Mensagem());
    }

    public Mensagem getMessagem() {
        return messagem;
    }

    public void setMessagem(Mensagem messagem) {
        this.messagem = messagem;
    }

    public void enviarMensagem (SistemaDistribuidodeClocksESincronizacaoDetempo sistema, No1 destinatario){
        getMessagem().setRemetente(this);
        System.out.println(toString());
        setSistema(sistema);
        getSistema().enviarMensagem(getMessagem(), destinatario);
    }

    public void receberMensagem(Mensagem mensagem) {
        setSistema(new SistemaDistribuidodeClocksESincronizacaoDetempo());
        getSistema().atualzarClock(mensagem);
        setMessagem(mensagem);
    }

    public static int getContadorlocal1() {
        return contadorlocal1;
    }

    public static void setContadorlocal1(int contadorlocal1) {
        No1.contadorlocal1 = contadorlocal1;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " messagem='" + getMessagem().toString() + "'" +
            "}" + " { " + " Contador Local= " + getContadorlocal1();
    }

    public SistemaDistribuidodeClocksESincronizacaoDetempo getSistema() {
        return sistema;
    }

    public void setSistema(SistemaDistribuidodeClocksESincronizacaoDetempo sistema) {
        this.sistema = sistema;
    }

}
