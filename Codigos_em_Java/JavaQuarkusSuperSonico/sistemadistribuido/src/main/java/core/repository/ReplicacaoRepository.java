package core.repository;

import java.util.ArrayList;
import java.util.List;
import core.model.SnapshotEstado;


public class ReplicacaoRepository {

    private List<SnapshotEstado> replicas;
    private static ReplicacaoRepository instance;

    private ReplicacaoRepository() {
        setReplicas(new ArrayList<>());
    }

    public static ReplicacaoRepository getInstance() {
        if (instance == null) {
            synchronized (ReplicacaoRepository.class) {
                if (instance == null) {
                    setInstance(new ReplicacaoRepository());
                }
            }
        }
        return instance;
    }

    // Adiciona uma réplica ao repositório
    public SnapshotEstado adicionarReplica(SnapshotEstado replica) {
        return getReplicas().add(replica) ? replica : null;
    }

    // Lista todas as réplicas armazenadas
    public List<SnapshotEstado> listarReplicas() {
        return getReplicas();
    }

    // Remove uma réplica específica com base no índice
    public boolean removerReplica(SnapshotEstado replica) {
        return getReplicas().remove(replica);
    }

    // Métodos de acesso
    private List<SnapshotEstado> getReplicas() {
        return replicas;
    }

    private void setReplicas(List<SnapshotEstado> replicas) {
        this.replicas = replicas;
    }

    private static void setInstance(ReplicacaoRepository instance) {
        ReplicacaoRepository.instance = instance;
    }
}
