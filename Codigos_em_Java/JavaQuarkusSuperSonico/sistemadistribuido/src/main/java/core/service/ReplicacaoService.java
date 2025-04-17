package core.service;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;
import java.util.List;
import core.model.Sensor;
import core.model.SnapshotEstado;
import core.repository.ReplicacaoRepository;


@ApplicationScoped
public class ReplicacaoService {

    private static ReplicacaoService instanceService;
    private static ReplicacaoRepository instanceRepository;

    private ReplicacaoService() {
        setInstanceRepository(ReplicacaoRepository.getInstance());
    }

    public static ReplicacaoService getInstance() {
        if (getInstanceService() == null) {
            synchronized (ReplicacaoService.class) {
                if (getInstanceService() == null) {
                    setInstanceService(new ReplicacaoService());
                }
            }
        }
        return getInstanceService();
    }

    // Método para replicar uma leitura de um sensor
    public SnapshotEstado replicarLeitura(Sensor sensor) {
        return getInstanceRepository()
        .adicionarReplica(new SnapshotEstado(sensor, LocalDateTime.now()));
    }

    // Método para listar todas as réplicas
    public List<SnapshotEstado> listarReplicas() {
        return getInstanceRepository().listarReplicas();
    }

    // Método para remover uma réplica específica
    public boolean removerReplica(SnapshotEstado replica) {
        return getInstanceRepository().removerReplica(replica);
    }

    // Métodos de acesso
    private static ReplicacaoRepository getInstanceRepository() {
        return instanceRepository;
    }

    private static void setInstanceRepository(ReplicacaoRepository instanceRepository) {
        ReplicacaoService.instanceRepository = instanceRepository;
    }

    private static ReplicacaoService getInstanceService() {
        return instanceService;
    }

    private static void setInstanceService(ReplicacaoService instanceService) {
        ReplicacaoService.instanceService = instanceService;
    }
}
