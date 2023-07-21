package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso3Digitos extends ConverterExtenso2Digitos{
    protected int i2;
    private String [] porExtensoCentena = {
        "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };
    public ConverterExtenso3Digitos(int i2) {
        super(i2%100);
        setI(i2);
    }
    public int getI() {
        return this.i2;
    }
    public void setI(int i2) {
        this.i2 = i2;
    }
    @Override
    public String toString() {
        int centena = getI()/100;
        return porExtensoCentena[centena] + super.toString();
    }

}
