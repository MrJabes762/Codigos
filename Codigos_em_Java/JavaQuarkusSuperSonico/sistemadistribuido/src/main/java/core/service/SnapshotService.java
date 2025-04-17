package core.service;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.List;
import core.model.Sensor;
import core.model.SnapshotEstado;
import core.repository.SnapshotRepository;

@ApplicationScoped
public class SnapshotService {

    private static SnapshotService instanceService;
    private static SnapshotRepository instanceRepository;

    private SnapshotService() {
        setInstanceRepository(SnapshotRepository.getInstance());
    }

    public static SnapshotService getInstance() {
        if (getInstanceService() == null) {
            synchronized (SnapshotService.class) {
                if (getInstanceService() == null) {
                    setInstanceService(new SnapshotService());
                }
            }
        }
        return getInstanceService();
    }

    public SnapshotEstado criarSnapshot(Sensor sensor) {
        return getInstanceRepository()
            .adicionarSnapshot(new SnapshotEstado(sensor, LocalDateTime.now()));
    }

    public List<SnapshotEstado> listarSnapshots() {
        return getInstanceRepository().listarSnapshots();
    }

    // Métodos de acesso
    private static SnapshotRepository getInstanceRepository() {
        return instanceRepository;
    }

    private static void setInstanceRepository(SnapshotRepository instanceRepository) {
        SnapshotService.instanceRepository = instanceRepository;
    }

    private static SnapshotService getInstanceService() {
        return instanceService;
    }

    private static void setInstanceService(SnapshotService instanceService) {
        SnapshotService.instanceService = instanceService;
    }
}
