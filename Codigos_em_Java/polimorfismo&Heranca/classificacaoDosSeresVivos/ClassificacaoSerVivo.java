
import java.util.ArrayList;
import java.util.List;

public class ClassificacaoSerVivo implements SerVivo {
    private List<SerVivo> seresVivos;

    public ClassificacaoSerVivo() {
        setSeresVivos(new ArrayList<>());
    }

    public void adicionarClassificacao(SerVivo serVivo) {
        getSeresVivos().add(serVivo);
    }

    public void removerClassificacao(SerVivo serVivo) {
        getSeresVivos().remove(serVivo);
    }

    @Override
    public void mostrar() {
        getSeresVivos().forEach(servivo -> servivo.mostrar());
    }

    public List<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(List<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }
}
