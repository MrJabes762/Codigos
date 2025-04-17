package core.model;

public class LeituraClimatica {
    private double temperatura;
    private double umidade;

    public LeituraClimatica() {
        setTemperatura(0.0);
        setUmidade(0.0);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
    @Override
    public String toString() {
        return "LeituraClimatica{" +
                "temperatura=" + temperatura +
                ", umidade=" + umidade +
                '}';
    }
}
