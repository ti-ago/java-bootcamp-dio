package set.pesquisa.tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("estudar");
        tarefas.adicionarTarefa("dormir");
        tarefas.adicionarTarefa("banhar");
        tarefas.adicionarTarefa("malhar");
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());
        tarefas.marcarTarefaConcluída("malhar");
        System.out.println(tarefas.obterTarefasPendentes());
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();


    }
}
