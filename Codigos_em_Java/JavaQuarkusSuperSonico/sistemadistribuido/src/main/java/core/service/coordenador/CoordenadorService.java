package core.service.coordenador;

import core.model.Sensor;

 class CoordenadorService {
    
    private static CoordenadorService instanceCoordenadorService;
    private Sensor coordenadorSensor;

    private CoordenadorService() {
        setCoordenadorSensor(null);
    }

    static CoordenadorService getInstance() {
        if (getInstanceCoordenadorService() == null) {
            synchronized (CoordenadorService.class) {
                if (getInstanceCoordenadorService() == null) {
                    setInstanceCoordenadorService(new CoordenadorService());
                }
            }
        }
        return getInstanceCoordenadorService();
    }

    public void defineCoordenadorSensor(Sensor coordenadorSensor) {
        setCoordenadorSensor(coordenadorSensor);
    }

    public boolean possuiCoordenadorSensor() {
        return getCoordenadorSensor() != null;
    }

    public Sensor getCoordenadorSensor() {
        return coordenadorSensor;
    }

    private void setCoordenadorSensor(Sensor coordenadorSensor) {
        this.coordenadorSensor = coordenadorSensor;
    }

    public static CoordenadorService getInstanceCoordenadorService() {
        return instanceCoordenadorService;
    }

    public static void setInstanceCoordenadorService(CoordenadorService instanceCoordenadorService) {
        CoordenadorService.instanceCoordenadorService = instanceCoordenadorService;
    }

}
