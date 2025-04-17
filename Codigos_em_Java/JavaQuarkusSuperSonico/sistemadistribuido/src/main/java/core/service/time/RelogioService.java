package core.service.time;

import jakarta.enterprise.context.ApplicationScoped;

// Classe de gerenciamento do Relógio de Lamport
// Injeção do proprio relogio via Singleton

@ApplicationScoped
public class RelogioService {
    private static RelogioLamport relogio;

    public RelogioService() {
        setRelogio(RelogioLamport.getInstance());
    }

    public void eventoIncrementar (){
        getRelogio().incrementar();
    }

    public void eventoRecebido (int tempo){
        getRelogio().atualizar(tempo);
    }

    public int getTempo(){
        return getRelogio().getTempo();
    }

    private static RelogioLamport getRelogio() {
        return relogio;
    }

    private static void setRelogio(RelogioLamport relogio) {
        RelogioService.relogio = relogio;
    }
}
