package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso2Digitos extends ConverterExtenso1Digito {
    private int i3;

    public int getI3() {
        return i3;
    }

    public ConverterExtenso2Digitos(int i3) {
        super(i3%10);
        if ((this.i3 > 9) && (this.i3 <= 99)) {
            setI(i3);
        }
    }

    public void setI(int i3) {
        this.i3 = i3;
    }

    private String[] porExtenso = { "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta",
            "Noventa" };
    private String[] porExtenso1020 = { "Dez","onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    @Override
    public String toString() {
        System.out.println(getI3());
        if ((this.i3 > 9) && (this.i3 < 20)) {
            return porExtenso1020[(this.i3 / 10)] + super.toString();
        }
            return porExtenso[(this.i3 / 10)] + super.toString();
    }

}
