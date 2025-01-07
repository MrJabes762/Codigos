package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso4Digitos extends ConverterExtenso3Digitos {
    protected int i;

    private String[] porExtensoMilhar = {"", "Mil", "Dois Mil", "Três Mil", "Quatro Mil", "Cinco Mil", "Seis Mil",
            "Sete Mil", "Oito Mil", "Nove Mil" };

    public ConverterExtenso4Digitos(int i) {
        super(i%1000);
        setI(i);
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        int milhar = (i / 1000);
        if (milhar > 0) {
            return porExtensoMilhar[milhar] + super.toString();
        }
        return null;
    }

}
