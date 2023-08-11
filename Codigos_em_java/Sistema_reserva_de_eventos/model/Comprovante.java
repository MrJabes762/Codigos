import java.util.Date;

public class Comprovante {
    private static IngressosSelecionados ingressosSelecionados;
    private Date data;
    public Comprovante(IngressosSelecionados ingressosSelecionados,Date data) {
        setIngressosSelecionados (ingressosSelecionados);
        setData(data);
    }
    public static IngressosSelecionados getIngressosSelecionados() {
        return ingressosSelecionados;
    }
    public static void setIngressosSelecionados(IngressosSelecionados ingressosSelecionados) {
        Comprovante.ingressosSelecionados = ingressosSelecionados;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
