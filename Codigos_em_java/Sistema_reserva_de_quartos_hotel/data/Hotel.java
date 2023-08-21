import java.util.List;

public class Hotel {
    private List<Quarto> quartos;

    public Hotel() {
        setQuartos();
    }

    public void adicionarQuartos(Quarto quarto) {
        if (quarto != null) {
            getQuartos().add(quarto);
        } else {
            throw new ArgumentoInrregularException("Argumento irregular");
        }
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos() {
        this.quartos = new List();
    }
}
