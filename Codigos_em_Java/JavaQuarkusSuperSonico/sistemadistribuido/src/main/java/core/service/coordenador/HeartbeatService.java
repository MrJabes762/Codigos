package core.service.coordenador;

public class HeartbeatService {
    private final CoordenadorService coordenadorService = CoordenadorService.getInstance();

    public boolean verificarCoordenador(){
        System.out.println("Verificando coordenador...");
        System.out.println("Coordenador ?: " + coordenadorService.possuiCoordenadorSensor());
        return coordenadorService.possuiCoordenadorSensor();
    }

    public void monitorar (){
        if(!verificarCoordenador()){
            System.out.println("Coordenador não encontrado, iniciando eleição...");
            new EleicaoService().iniciarEleicao();
        }
    }
}
