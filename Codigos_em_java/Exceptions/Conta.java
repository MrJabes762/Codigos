
public class Conta {
    private float saldo;


    public Conta(float saldo) {
        this.saldo = saldo;
    }
    

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            "}";
    }

}
