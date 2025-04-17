package core.proxy;

import core.model.Sensor;
import core.repository.SensorRepository;

public class ProxySecuritySensorValidation {
    private static ProxySecuritySensorValidation instanceValidation;
    private static SensorRepository instanceRepository;
    
    private ProxySecuritySensorValidation() {
        setInstanceRepository(SensorRepository.getInstance());
    }
    
    public static ProxySecuritySensorValidation getInstance() {
        if (getInstanceSValidation() == null) {
            // Verifica se a instância já foi criada
            synchronized (ProxySecuritySensorValidation.class) {
                if (getInstanceSValidation() == null) {
                    setInstanceValidation (new ProxySecuritySensorValidation());
                }
            }
        }
        return getInstanceSValidation();
    }

    //Validações usadas no momento de Adição de sensores
    public void validacaoDeLocalizacao (String localizacao) throws IllegalArgumentException {
        if (localizacao == null || localizacao.isEmpty()) {
            throw new IllegalArgumentException("Localização não pode ser nula ou vazia.");
        }
    }
    
    //Validações usadas no momento de Adição de sensores
    public void validacaoDeIdentificacao (String identificacao) throws IllegalArgumentException{
        if (identificacao == null || identificacao.isEmpty()) {
            throw new IllegalArgumentException("Identificação não pode ser nula ou vazia.");
        }
        if (buscarSensor(identificacao) != null) {
            throw new IllegalArgumentException("Sensor já cadastrado");
        }
    }
    public void validacaoPorId (int id) throws IllegalArgumentException{
        if(buscarSensor(id) == null){
            throw new IllegalArgumentException("Sensor não encontrado");
        }
    }
    public void validacaoPorIdentificacao (String identificacao) throws IllegalArgumentException{
        if(buscarSensor(identificacao) == null){
            throw new IllegalArgumentException("Sensor não encontrado");
        }
    }
    public void validaçãoDeExclusão (int id) throws IllegalArgumentException{
        if (buscarSensor(id) == null) {
            throw new IllegalArgumentException("Sensor não encontrado");
        }
    }
    public void validacaoDeListagem() throws IllegalArgumentException{
        if (getInstanceRepository().listarSensores().isEmpty()) {
            throw new IllegalArgumentException("Nenhum sensor cadastrado");
        }
        
    }
    private Sensor buscarSensor(String identificacao) {
        return getInstanceRepository().buscarSensor(identificacao);
    }
    private Sensor buscarSensor(int id) {
        return getInstanceRepository().buscarSensor(id);
    }
    private static ProxySecuritySensorValidation getInstanceSValidation() {
        return instanceValidation;
    }
    private static void setInstanceValidation(ProxySecuritySensorValidation instanceValidation) {
        ProxySecuritySensorValidation.instanceValidation = instanceValidation;
    }
    private static SensorRepository getInstanceRepository() {
        return instanceRepository;
    }
    private static void setInstanceRepository(SensorRepository instanceRepository) {
        ProxySecuritySensorValidation.instanceRepository = instanceRepository;
    }
    
}
