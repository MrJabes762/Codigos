package core.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.model.SnapshotEstado;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SnapshotRepository {

    private List<SnapshotEstado> snapshots;
    private static SnapshotRepository instance;
    private static final String FILE_PATH = "snapshots.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    private SnapshotRepository() {
        setSnapshots(new ArrayList<>());
        carregarSnapshotsDoArquivo();
    }

    public static SnapshotRepository getInstance() {
        if (instance == null) {
            synchronized (SnapshotRepository.class) {
                if (instance == null) {
                    setInstance(new SnapshotRepository());
                }
            }
        }
        return instance;
    }

    public SnapshotEstado adicionarSnapshot(SnapshotEstado snapshot) {
        listarSnapshots().add(snapshot);
        salvarSnapshotsNoArquivo();
        return snapshot;
    }

    public List<SnapshotEstado> listarSnapshots() {
        return getSnapshots();
    }

    private void salvarSnapshotsNoArquivo() {
        try {
            getObjectMapper().writeValue(new File(getFilePath()), listarSnapshots());
        } catch (IOException e) {
            System.err.println(" Erro ao salvar snapshots: " + e.getMessage());
        }
    }

    private void carregarSnapshotsDoArquivo() {
        try {
            File file = new File(getFilePath());
            if (file.exists()) {
                setSnapshots(getObjectMapper().readValue(file, new TypeReference<List<SnapshotEstado>>() {}));
                System.out.println(" Snapshots carregados: " + listarSnapshots().size());
            }
        } catch (IOException e) {
            System.err.println(" Erro ao carregar snapshots: " + e.getMessage());
        }
    }

    private static void setInstance(SnapshotRepository instance) {
        SnapshotRepository.instance = instance;
    }

    private List<SnapshotEstado> getSnapshots() {
        return snapshots;
    }

    private void setSnapshots(List<SnapshotEstado> snapshots) {
        this.snapshots = snapshots;
    }

    private static String getFilePath() {
        return FILE_PATH;
    }

    ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}