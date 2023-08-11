public interface OperacoesDoSistema {
    public void cadastrarEventos (Evento evento);
    public List<> pesquisarEventosdisponiveis ();
    public void reservarIngresso (Ingresso ingresso);
    public void gerarComprovante ();
    public Comprovante getComprovante ();
    public double getTotaldasreservas (Comprovante comprovante);
}
