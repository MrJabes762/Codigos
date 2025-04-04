package model;

/**
 * Enumeração que representa as prioridades de uma tarefa utilizando padrão multiton.
 * As prioridades são definidas por um valor inteiro, onde
 * valores menores indicam maior prioridade.
 */

public enum  Prioridade {
    URGENTE(1),
    ALTA(2),
    MEDIA(3),
    BAIXA(4);
    private final int prioridade;
    Prioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public int getPrioridade() {
        return prioridade;
    }
}
