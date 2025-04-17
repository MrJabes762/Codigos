package core.model;

import java.io.Serializable;

public class MensagemMulticast implements Serializable {
    private String origem;
    private String conteudo;
    private long timestamp;

    public MensagemMulticast(String origem, String conteudo) {
        setTimestamp(System.currentTimeMillis());
        setOrigem(origem);
        setConteudo(conteudo);
    }

    // Metodos de acesso
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MensagemMulticast [getOrigem()=" + getOrigem() + ", getConteudo()=" + getConteudo() + ", getDestino()="
                 + ", getTimestamp()=" + getTimestamp() + "]";
    }
}
