package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso1Digito extends ConverterExtenso{
    protected int numero;

    public ConverterExtenso1Digito(int numero) {
        setNumero(numero);
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }
    protected int getNumero() {
        return this.numero;
    }
    private String[] porExtensoUnidade =  { " Zero", " Um", " Dois", " Três", " Quatro", " Cinco", " Seis", " Sete", " Oito", " Nove"};
    @Override
    public String toString() {
        return porExtensoUnidade[getNumero() / 1];
    }

}

