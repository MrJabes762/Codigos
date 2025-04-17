package core.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import core.model.Sensor;
import core.proxy.ProxySecuritySensorValidation;
import core.repository.SensorRepository;

@ApplicationScoped
public class SensorService {

    //Singletons
    private static SensorService instanceService;
    private static SensorRepository instanceRepository;
    private static ProxySecuritySensorValidation instanceValidation;
    private static LeituraClimaticaService leituraClimaticaService;

    private SensorService() {
        setInstanceValidation(ProxySecuritySensorValidation.getInstance());
        setInstanceRepository(SensorRepository.getInstance());
        setLeituraClimaticaService(LeituraClimaticaService.getInstance());
    }

    public static SensorService getInstance() {
        if (getInstanceService() == null) {
            // Verifica se a instância já foi criada
            synchronized (SensorService.class) {
                if (getInstanceService() == null) {
                    setInstanceService(new SensorService());
                }
            }
        }
        return getInstanceService();
    }

    // Métodos de Adição de Sensores
    // Valida os parametros via Proxy De Proteção 
    public Sensor adicionarSensor(String identificacao, String localizacao) throws IllegalArgumentException {
        getInstanceValidation().validacaoDeIdentificacao(identificacao);
        getInstanceValidation().validacaoDeLocalizacao(localizacao);
        return getInstanceRepository().adicionarSensor(new Sensor(identificacao, localizacao));
    }

    // Métodos de Leitura de Sensores de Forma aleatoria
    public void gerarLeituraClimática() {
        listarSensores()
                .stream()
                .forEach(sensor -> {
                    sensor.atualizarEstado(
                            getLeituraClimaticaService()
                                    .gerarLeituraClimatica()
                                    .getTemperatura(), 
                            getLeituraClimaticaService()
                                    .gerarLeituraClimatica()
                                    .getUmidade()
                    );
                    atualizarSensor(sensor);
                });
    }

    public void atualizarSensor(Sensor sensor) throws IllegalArgumentException {
        getInstanceRepository().atualizarSensor(buscarSensorPorId(sensor.getIdLocal()));
    }

    public Sensor buscarSensorPorId(int id) throws IllegalArgumentException{
        getInstanceValidation().validacaoPorId(id);
        return getInstanceRepository().buscarSensor(id);
    }

    public Sensor buscarSensorPorIdentificacao(String identificacao) throws IllegalArgumentException {
        getInstanceValidation().validacaoPorIdentificacao(identificacao);
        return getInstanceRepository().buscarSensor(identificacao);
    }

    public List<Sensor> listarSensores() throws IllegalArgumentException{
        getInstanceValidation().validacaoDeListagem();
        return getInstanceRepository().listarSensores();
    }

    public boolean removerSensor(int id) throws IllegalArgumentException {
        getInstanceValidation().validaçãoDeExclusão(id);
        return getInstanceRepository().removerSensor(id);
    }

    // Metodos de Acesso
    private static SensorRepository getInstanceRepository() {
        return instanceRepository;
    }

    private static void setInstanceRepository(SensorRepository instanceRepository) {
        SensorService.instanceRepository = instanceRepository;
    }

    private static ProxySecuritySensorValidation getInstanceValidation() {
        return instanceValidation;
    }

    private static void setInstanceValidation(ProxySecuritySensorValidation instanceValidation) {
        SensorService.instanceValidation = instanceValidation;
    }

    private static SensorService getInstanceService() {
        return instanceService;
    }

    private static void setInstanceService(SensorService instanceService) {
        SensorService.instanceService = instanceService;
    }

    private static LeituraClimaticaService getLeituraClimaticaService() {
        return leituraClimaticaService;
    }

    private static void setLeituraClimaticaService(LeituraClimaticaService leituraClimaticaService) {
        SensorService.leituraClimaticaService = leituraClimaticaService;
    }
}
