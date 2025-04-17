package core.repository;

import java.util.ArrayList;
import java.util.List;

import core.model.Sensor;

public class SensorRepository {
    private List<Sensor> sensors;
    private static SensorRepository instance;

    private SensorRepository() {
        setSensors(new ArrayList<>());
    }
    public static SensorRepository getInstance() {
        if (instance == null) {
            synchronized (SensorRepository.class) {
                if (instance == null) {
                    setInstance(new SensorRepository());
                }
            }
        }
        return instance;
    }

    public Sensor adicionarSensor (Sensor sensor){
        return getSensors().add(sensor) ? sensor : null;
    }
    public Sensor buscarSensor (int id){
        for (Sensor sensor : getSensors()) {
            if (sensor.getIdLocal() == id) {
                return sensor;
            }
        }
        return null;
    }
    public Sensor buscarSensor (String identificacao){
        for (Sensor sensor : getSensors()) {
            if (sensor.getIdentificacao().equals(identificacao)) {
                return sensor;
            }
        }
        return null;
    }
    public boolean removerSensor (int id){
        return getSensors().removeIf(sensor -> sensor.getIdLocal() == id);
    }
    public List<Sensor> listarSensores(){
        return getSensors();
    }
    public void atualizarSensor(Sensor sensor) {
        getSensors().stream().forEach(s -> {
            if (s.getIdLocal() == sensor.getIdLocal()) {
                s.setTemperatura(sensor.getTemperatura());
                s.setUmidade(sensor.getUmidade());
            }
        });
    }
    private List<Sensor> getSensors() {
        return sensors;
    }

    private void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }
    private static void setInstance(SensorRepository instance) {
        SensorRepository.instance = instance;
    }
}
