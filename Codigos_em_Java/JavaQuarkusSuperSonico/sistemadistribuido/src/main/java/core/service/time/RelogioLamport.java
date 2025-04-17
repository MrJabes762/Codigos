package core.service.time;

class RelogioLamport {
    private static RelogioLamport relogio;
    private int tempo;

    private RelogioLamport() {
        setTempo(0);
    }

    static RelogioLamport getInstance() {
        synchronized (RelogioLamport.class) {
            if (getRelogio() == null) {
                setRelogio(new RelogioLamport());
            }
        }
        return getRelogio();
    }

    public synchronized void incrementar() { // incrementa o tempo
        setTempo(getTempo() + 1);
    }

    public synchronized void atualizar(int tempo) {// atualiza o tempo
        setTempo(Math.max(getTempo(), tempo) + 1);
    }
    
    private static RelogioLamport getRelogio() {
        return relogio;
    }

    private static void setRelogio(RelogioLamport relogio) {
        RelogioLamport.relogio = relogio;
    }

    int getTempo() {
        return tempo;
    }

    private void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "RelogioLamport [getTempo()=" + getTempo() + "]";
    }
}
