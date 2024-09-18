
package model;

public interface Operacoes {
    public void deposita (float valor) throws OperacaoIrregularExceptions;
    public void saca (float valor) throws OperacaoIrregularExceptions;
}
