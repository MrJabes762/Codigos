package controller;

import model.Tarefa;
import service.TarefasService;

/**
 * Controlador de tarefas que atua como um front controller e singleton.
 * Este controlador é responsável por gerenciar as operações relacionadas às tarefas,
 * como adicionar, remover, atualizar e listar tarefas.
 */
public class TarefasController {
    private static TarefasController instance;
    private static TarefasService intanceService;

    private TarefasController() {
        setIntanceService(TarefasService.getInstance());
    }
    public static TarefasController getInstance() {
        if (instance == null) {
            synchronized (TarefasController.class) {
                if (instance == null) {
                    instance = new TarefasController();
                }
            }
        }
        return instance;
    }
    public String postTarefa(Tarefa tarefa) {
        return getIntanceService().adicionarTarefa(tarefa);
    }
    public String deleteTarefa(Tarefa tarefa) {
        return getIntanceService().removerTarefa(tarefa);
    }
    public String putTarefa(Tarefa tarefa) {
        return getIntanceService().atualizarTarefa(tarefa);
    }
    public String getlistTarefas() {
        return getIntanceService().listarTarefas();
    }
    public String concluirTarefa(Tarefa tarefa) {
        return getIntanceService().concluirTarefa(tarefa);
    }
    public String findById(int id) {
        return getIntanceService().getTarefaPorId(id).toString();
    }
    private static TarefasService getIntanceService() {
        return intanceService;
    }

    private static void setIntanceService(TarefasService intanceService) {
        TarefasController.intanceService = intanceService;
    }
}
