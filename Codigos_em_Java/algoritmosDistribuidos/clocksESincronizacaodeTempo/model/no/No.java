package model.no;

public abstract class No {
    
    private static int contador;

    protected static int getContador() {
        return contador;
    }

    protected static void setContador(int contador) {
        No.contador = contador;
    }
}
