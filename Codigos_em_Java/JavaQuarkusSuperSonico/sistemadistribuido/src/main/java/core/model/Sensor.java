package core.model;

public class Sensor {
    private static int idGlobal;
    private int idLocal;
    private String identificacao;
    private String localizacao;
    private double temperatura;
    private double umidade;

    public Sensor(String identificacao, String localizacao) {
        setIdLocal(++idGlobal);
        setIdentificacao(identificacao);
        setLocalizacao(localizacao);
        setTemperatura(0.0);
        setUmidade(0.0);
    }
    public void atualizarEstado(double temperatura, double umidade) {
        setTemperatura(temperatura);
        setUmidade(umidade);
    }
    
    //Metodos de acesso
    public static int getIdGlobal() {
        return idGlobal;
    }
    public int getIdLocal() {
        return idLocal;
    }
    private void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }
    public String getIdentificacao() {
        return identificacao;
    }
    private void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    private void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getUmidade() {
        return umidade;
    }
    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
    @Override
    public String toString() {
        return "Sensor [getIdLocal()=" + getIdLocal() + ", getIdentificacao()=" + getIdentificacao()
                + ", getLocalizacao()=" + getLocalizacao() + ", getTemperatura()=" + getTemperatura()
                + ", getUmidade()=" + getUmidade() + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sensor other = (Sensor) obj;
        if (identificacao == null) {
            if (other.identificacao != null)
                return false;
        } else if (!identificacao.equals(other.identificacao))
            return false;
        return true;
    }

    
}
