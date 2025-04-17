package core.model;

import java.time.LocalDateTime;

public class SnapshotEstado {
    private Sensor sensor;
    private LocalDateTime dataHora;

    public SnapshotEstado(Sensor sensor, LocalDateTime dataHora) {
        setSensor(sensor);
        setDataHora(dataHora);
    }
    // Métodos de acesso
    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    @Override
    public String toString() {
        return "SnapshotEstado [getSensor()=" + getSensor().toString() + ", getDataHora()=" + getDataHora().toString() + "]";
    }
}
