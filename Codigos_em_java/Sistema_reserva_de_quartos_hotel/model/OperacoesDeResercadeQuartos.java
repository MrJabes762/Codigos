public interface OperacoesDeResercadeQuartos {
    public boolean cadastroDeQuartosNoHotel (Quarto quarto) throws ArgumentoInrregularException;
    public boolean reservarQuartos (int id);
    public double getTotaldasReservas();
    public ComprovantedeReserva getComprovante ();
    public boolean gerarComprovante (double valorDoPagamento);
}
