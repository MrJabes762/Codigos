
public class SistemaReservadeQuartosHotel implements OperacoesDeResercadeQuartos{
    private Hotel hotel;
    private HotelReservado reservados;
    public SistemaReservadeQuartosHotel (){
        setHotel(new Hotel());
        setReservados (new HotelReservado());
    }
    @Override
    public boolean cadastroDeQuartosNoHotel(Quarto quarto) {
        try {
            getHotel().adicionarQuartos(quarto)
            return true;
        } catch (ArgumentoInrregularException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ComprovantedeReserva getComprovante() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getTotaldasReservas() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean reservarQuartos(int id) {
        
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
