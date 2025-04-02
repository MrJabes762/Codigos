import java.util.List;
public class HotelReservado {
    private List<Quarto> quartosreservados;

    public HotelReservado() {
        setQuartosreservados();
    }
    public boolean adicionarQuartosReservados (Quarto quarto) {
        if (quarto != null) {
            getQuartosreservados().add(quarto);
            return true;
        } else {
            throw new ArgumentoInrregularException("Argumento irregular");
        }
    }
    
    public List<Quarto> getQuartosreservados() {
        return quartosreservados;
    }

    public void setQuartosreservados() {
        this.quartosreservados = new List ();
    }
}
