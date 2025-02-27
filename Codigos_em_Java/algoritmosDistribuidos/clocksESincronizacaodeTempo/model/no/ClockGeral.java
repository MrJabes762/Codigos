package model.no;

public abstract class ClockGeral {
    
    private static int contador;

    protected static int getContador() {
        return contador;
    }

    protected static void setContador(int contador) {
        ClockGeral.contador = contador;
    }
}
