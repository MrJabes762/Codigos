
public class SistemaReservadeQuartosHotel implements OperacoesDeResercadeQuartos {
    private Hotel hotel;
    private HotelReservado reservados;
    private double total;
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getTotaldasReservas() {
        for (int i = 0; i < getReservados().getQuartosreservados().size(); i++) {
            total += getReservados().getQuartosreservados().get(i).getValor();
        }
        return total;
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
}
