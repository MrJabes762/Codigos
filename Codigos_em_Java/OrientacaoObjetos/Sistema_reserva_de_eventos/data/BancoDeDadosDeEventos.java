import java.util.List;

public class BancodeDadosDeEventos {
    private static List <Evento> bancoDeDadosDeEventos;

    public BancodeDadosDeEventos (){
        setBancoDeEventos();
    }
    public static List<Evento> getBancoDeEventos() {
        return bancoDeDadosDeEventos;
    }

    public void setBancoDeEventos() {
        BancodeDadosDeEventos.bancoDeDadosDeEventos = new List ();
    }
    public void adicionarEventosNoBancoDeDados (Evento evento){
        getBancoDeEventos().add(evento);
    }
}
