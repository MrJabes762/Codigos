package core.service.coordenador;

import java.util.Comparator;
import java.util.List;

import core.model.Sensor;
import core.service.SensorService;

public class EleicaoService {

    private static CoordenadorService coordenadorService;
    private static SensorService sensorService;

    public EleicaoService() {
        setCoordenadorService(CoordenadorService.getInstance());
        setSensorService(SensorService.getInstance());
    }

    public void iniciarEleicao() {

        try {
            System.out.println("Iniciando eleição...");
            List<Sensor> sensores = getSensorService().listarSensores();

            // Bully: vence o sensor com maior ID local
            Sensor lider = sensores.stream()
                    .max(Comparator.comparingInt(Sensor::getIdLocal))
                    .orElse(null);

            if (lider != null) {
                getCoordenadorService().defineCoordenadorSensor(lider);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao iniciar eleição: " + e.getMessage());
        }
    }

    private static CoordenadorService getCoordenadorService() {
        return coordenadorService;
    }

    private static void setCoordenadorService(CoordenadorService coordenadorService) {
        EleicaoService.coordenadorService = coordenadorService;
    }

    private static SensorService getSensorService() {
        return sensorService;
    }

    private static void setSensorService(SensorService sensorService) {
        EleicaoService.sensorService = sensorService;
    }

}
