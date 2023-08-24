import java.util.List;

public class Hotel {
    private List<Quarto> quartos;

    public Hotel() {
        setQuartos();
    }

    public boolean adicionarQuartos(Quarto quarto) {
        if (quarto != null) {
            getQuartos().add(quarto);
            return true;
        } else {
            throw new ArgumentoInrregularException("Argumento irregular");
        }
    }
    public Quarto pegarQuarto (int iD){
        Quarto quartoBusca;
       for (int index = 0; index < getQuartos().size(); index++) {
            if (iD == getQuartos().get(index).getiD()){
                quartoBusca = getQuartos().get(index);
                getQuartos().remove(index);
                return quartoBusca;
            }
       }
       throw new ArgumentoInrregularException("Quarto não encontrado ou incorreto");
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos() {
        this.quartos = new List();
    }
}
