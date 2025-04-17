package service;

import data.TarefasRepository;
import model.Tarefa;

/**
 * Serviço de tarefas que atua como um singleton e um Service Layer.
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
        if (getInstance() == null) {
            synchronized (TarefasService.class) {
                if (getInstance() == null) {
                    setInstance(new TarefasService());
                }
            }
        }
        return getInstance();
    }
    public String adicionarTarefa(Tarefa tarefa) {
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
        return getInstanceRepository().getTarefaPorId(id);
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
    private static void setInstance(TarefasService instance) {
        TarefasService.instance = instance;
    }
}
