package data;
import java.util.HashMap;
import java.util.Map;

import model.Tarefa;
import service.TarefasService;

/**
 * Repositório de tarefas que atua como um singleton.
 * Este repositório é responsável por armazenar e gerenciar as tarefas.
 */

public class TarefasRepository {
    private static TarefasRepository instance;
    private Map<Integer,Tarefa> tarefas;
    private TarefasRepository() {
        setTarefas(new HashMap<>());
    }

    public static TarefasRepository getInstance() {
        if (instance == null) {
            synchronized (TarefasRepository.class) {
                if (instance == null) {
                    instance = new TarefasRepository();
                }
            }
        }
        return instance;
    }
    public String adicionarTarefa(Tarefa tarefa) {
       getTarefas().put(tarefa.getIdlocal(), tarefa);
       return getTarefasCadastradas();
    }
    public String getTarefasCadastradas() {
        return toString();
    }

    public String removerTarefa(Tarefa tarefa) {
        getTarefas().remove(tarefa.getIdlocal());
        return getTarefasCadastradas(); 
    }
    public String atualizarTarefa(Tarefa tarefa) {
        adicionarTarefa(tarefa);
        return getTarefasCadastradas();
    }
    public Tarefa getTarefaPorId(int id) {
        return getTarefas().get(id);
    }

    private Map<Integer,Tarefa> getTarefas() {
        return tarefas;
    }

    private void setTarefas(Map<Integer,Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Tarefa tarefa : getTarefas().values()) {
            sb.append(tarefa.toString()).append("\n");
        }
        return sb.toString();
    }
}
