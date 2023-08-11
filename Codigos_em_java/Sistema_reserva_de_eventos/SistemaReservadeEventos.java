public class SistemaReservadeEventos implements OperacoesDoSistema {

    private BancodeDadosDeEventos banco;
    private IngressosSelecionados ingressos;
    

    public SistemaReservadeEventos (){
        setBanco(new BancodeDadosDeEventos());
        setIngressos (new IngressosSelecionados());
    }
    @Override
    public void cadastrarEventos(Evento evento) {//Feito
        getBanco().adicionarEventosNoBancoDeDados(evento);


    @Override
    public void cadastrarEventos(Evento evento) {
       

    }

    @Override
    public void gerarComprovante() {

    }

    @Override
    public Comprovante getComprovante() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getTotaldasreservas(Comprovante comprovante) {
        // TODO Auto-generated method stub
        return 0;
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

    public List pesquisarEventosdisponiveis() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void reservarIngresso(Ingresso ingresso) {

    }
    
}
