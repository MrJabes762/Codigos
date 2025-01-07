import java.util.Calendar;
import java.util.Date;

public class Comprovante {
    private static IngressosSelecionados ingressosSelecionados;
    private Calendar data;
    public Comprovante(IngressosSelecionados ingressosSelecionados,Calendar data) {
        setIngressosSelecionados (ingressosSelecionados);
        setData(data);
    }
    public static IngressosSelecionados getIngressosSelecionados() {
        return ingressosSelecionados;
    }
    public static void setIngressosSelecionados(IngressosSelecionados ingressosSelecionados) {
        Comprovante.ingressosSelecionados = ingressosSelecionados;
    }
    public Calendar getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
