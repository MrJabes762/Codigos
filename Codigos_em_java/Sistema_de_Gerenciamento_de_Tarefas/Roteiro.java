public class Roteiro {
    public static void main(String[] args) {
        SistemaDeGerenciamentoDeTarefas sistema = new SistemaDeGerenciamentoDeTarefas ();
        sistema.cadastrarTarefas(new Tarefa ("Andar de Bike", "Pessoal", "Andar de Bike as 13:00", "Santo Antônio de Jesus", false));
        sistema.cadastrarTarefas(new Tarefa ("Limpar a Casa", "Pessoal", "Limpar a Casa as 20:00", "Santo Antônio de Jesus", false));
        sistema.cadastrarTarefas(new Tarefa ("Estudar Java", "Estudos", "Estudar Java e P.O.O as 7:00", "Santo Antônio de Jesus", false));
        sistema.cadastrarTarefas(new Tarefa ("Fazer Análise de Dados em Mysql", "Trabalho", "Fazer Análise de dados em MySql as 15:00", "Santo Antônio de Jesus", false));
        sistema.concluirTarefa ("Andar de Bike");
        sistema.concluirTarefa ("Estudar Java");
        sistema.listarTarefas ();
    }
}
