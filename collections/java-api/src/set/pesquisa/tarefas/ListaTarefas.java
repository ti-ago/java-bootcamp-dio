package set.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefas;

    public ListaTarefas(){
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.isConclusao()){
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(!tarefa.isConclusao()){
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluída(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConclusao(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConclusao(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefas = new HashSet<>();
        }
}



