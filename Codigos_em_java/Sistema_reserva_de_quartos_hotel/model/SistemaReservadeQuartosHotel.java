
public class SistemaReservadeQuartosHotel implements OperacoesDeResercadeQuartos {
    private Hotel hotel;
    private HotelReservado reservados;
    private ComprovantedeReserva comprovante;
    public SistemaReservadeQuartosHotel() {
        setHotel(new Hotel());
        setReservados(new HotelReservado());
    }

    @Override
    public boolean cadastroDeQuartosNoHotel(Quarto quarto) throws ArgumentoInrregularException {
        if (getHotel().adicionarQuartos(quarto)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ComprovantedeReserva getComprovante() {
        return this.comprovante;
    }

    @Override
    public double getTotaldasReservas() {
        return getComprovante().getValorTotal();
    }

    @Override
    public boolean reservarQuartos(int id) {
        if(getReservados().adicionarQuartosReservados(getHotel().pegarQuarto(id))){
            return true;
        }
        return false;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public HotelReservado getReservados() {
        return reservados;
    }

    public void setReservados(HotelReservado reservados) {
        this.reservados = reservados;
    }

    @Override
    public boolean gerarComprovante(double valorDoPagamento) {
        if (valorDoPagamento >= getTotaldasReservas()){
            setComprovante();
            return true;
        }else {
            throw new ArgumentoInrregularException("Valor incorreto ou insuficiente");
        }
    }

    public void setComprovante() {
        this.comprovante = new ComprovantedeReserva(getReservados());
    }
}
