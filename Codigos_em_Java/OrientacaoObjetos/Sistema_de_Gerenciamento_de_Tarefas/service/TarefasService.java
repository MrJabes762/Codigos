package service;

import data.TarefasRepository;
import model.Tarefa;

/**
 * Serviço de tarefas que atua como um singleton.
 * Este serviço é responsável por gerenciar as operações relacionadas às tarefas,
 * como adicionar, remover, atualizar e listar tarefas.
 */

public class TarefasService {
    private static TarefasService instance;
    private static TarefasRepository instanceRepository;

    private TarefasService() {
        setInstanceRepository(TarefasRepository.getInstance());
    }

    public static TarefasService getInstance() {
        if (instance == null) {
            synchronized (TarefasService.class) {
                if (instance == null) {
                    instance = new TarefasService();
                }
            }
        }
        return instance;
    }
    public String adicionarTarefa(Tarefa tarefa) {
        if (tarefa == null) {
            throw new IllegalArgumentException("A tarefa não pode ser nula.");
        }
        return getInstanceRepository().adicionarTarefa(tarefa);
    }
    public String removerTarefa(Tarefa tarefa) {
        return getInstanceRepository().removerTarefa(tarefa);
    }
    public String atualizarTarefa(Tarefa tarefa) {
        return getInstanceRepository().atualizarTarefa(tarefa);
    }
    public String listarTarefas() {
        return getInstanceRepository().getTarefasCadastradas();
    }
    public Tarefa getTarefaPorId(int id) {
        Tarefa tarefa = getInstanceRepository().getTarefaPorId(id);
        if (tarefa == null) {
            throw new IllegalArgumentException("Tarefa com ID " + id + " não encontrada.");
        }
        return tarefa;
    }
    public String concluirTarefa(Tarefa tarefa) {
        Tarefa tarefaExistente = getTarefaPorId(tarefa.getIdlocal());
        tarefaExistente.setConcluida(true);
        return atualizarTarefa(tarefaExistente);
    }
    private static TarefasRepository getInstanceRepository() {
        return instanceRepository;
    }

    private static void setInstanceRepository(TarefasRepository instanceRepository) {
        TarefasService.instanceRepository = instanceRepository;
    }

    private static TarefasRepository getRepository() {
        return instanceRepository;
    }

    private static void setRepository(TarefasRepository repository) {
        instanceRepository = repository;
    }
}
