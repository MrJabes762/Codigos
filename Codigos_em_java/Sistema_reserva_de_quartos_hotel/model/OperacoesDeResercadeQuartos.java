public interface OperacoesDeResercadeQuartos {
    public boolean cadastroDeQuartosNoHotel (Quarto quarto);
    public boolean reservarQuartos (int id);
    public double getTotaldasReservas();
    public ComprovantedeReserva getComprovante ();
}
