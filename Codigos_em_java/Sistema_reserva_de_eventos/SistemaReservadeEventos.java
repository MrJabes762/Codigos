import java.util.Calendar;

public class SistemaReservadeEventos implements OperacoesDoSistema {

    private BancodeDadosDeEventos banco;
    private IngressosSelecionados ingressos;
    private Comprovante comprovante;


    public SistemaReservadeEventos (){
        setBanco(new BancodeDadosDeEventos());
        setIngressos (new IngressosSelecionados());
    }

    @Override
    public void cadastrarEventos(Evento evento) {//Feito
        getBanco().adicionarEventosNoBancoDeDados(evento);
    }

    @Override
    public void gerarComprovante() {
        this.comprovante = new Comprovante (getIngressos(),Calendar.getInstance());
    }

    @Override
    public Comprovante getComprovante() {
        return this.comprovante;
    }

    @Override
    public double getTotaldasreservas(Comprovante comprovante) {
        return this.comprovante.getIngressosSelecionado();
    }

    @Override
    public List pesquisarEventosdisponiveis() {//feito
        return getBanco().getClass().getBancoDeEventos();
    }

    @Override
    public void reservarIngresso(Ingresso ingresso) {//feito
        getIngressos().adicinarIngressoSelecionado(ingresso);
    }
    public BancodeDadosDeEventos getBanco() {
        return banco;
    }
    public void setBanco(BancodeDadosDeEventos banco) {
        this.banco = banco;
    }
    public IngressosSelecionados getIngressos() {
        return ingressos;
    }
    public void setIngressos(IngressosSelecionados ingressos) {
        this.ingressos = ingressos;
    }
    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }
    
}
