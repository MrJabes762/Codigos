import java.util.Calendar;

public class ComprovantedeReserva {
    private HotelReservado totalReservas;
    private double valorTotal;
    private Calendar data;
    public ComprovantedeReserva(HotelReservado totalReservas) {
        setTotalReservas(totalReservas);
        setData();
        setValorTotal();
    }
    public HotelReservado getTotalReservas() {
        return this.totalReservas;
    }
    public void setTotalReservas(HotelReservado totalReservas) {
        this.totalReservas = totalReservas;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal() {
        for (int i = 0; i < getTotalReservas().getQuartosreservados().size(); i++) {
            this.valorTotal +=getTotalReservas().getQuartosreservados().get(i).getValor();
        }
    }
    public Calendar getData() {
        return this.data;
    }
    public void setData() {
        this.data = Calendar.getInstance();
    }
    
}
