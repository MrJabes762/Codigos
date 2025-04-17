package core.service;

import java.util.Random;

import core.model.LeituraClimatica;

public class LeituraClimaticaService {

    private LeituraClimatica leitura;
    private Random random;
    private static LeituraClimaticaService instance;
    
    private LeituraClimaticaService() {
        setLeitura(new LeituraClimatica());
        setRandom(new Random());
    }
    public static LeituraClimaticaService getInstance() {
        if (instance == null) {
            synchronized (LeituraClimaticaService.class) {
                if (instance == null) {
                    setInstance(new LeituraClimaticaService());
                }
            }
        }
        return instance;
    }
    public LeituraClimatica gerarLeituraClimatica() {
        double temperatura = getRandom().nextDouble(15, 35);// Temperatura entre 15 e 35 graus
        double umidade = getRandom().nextDouble(30, 90);// Umidade entre 30% e 90%
        getLeitura().setTemperatura(temperatura);
        getLeitura().setUmidade(umidade);
        return getLeitura();
    }
    private Random getRandom() {
        return random;
    }
    private void setRandom(Random random) {
        this.random = random;
    }
    private LeituraClimatica getLeitura() {
        return leitura;
    }
    private void setLeitura(LeituraClimatica leitura) {
        this.leitura = leitura;
    }
    private static void setInstance(LeituraClimaticaService instance) {
        LeituraClimaticaService.instance = instance;
    }
}
