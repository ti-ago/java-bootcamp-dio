package list.operacoesBasicas.listaTarefas;

public class Main {
    public static void main(String[] args) {

      ListaTarefa todo = new ListaTarefa();
      todo.adiconarTarefa("Estudar");
      todo.adiconarTarefa("Exercitar");
      todo.adiconarTarefa("Namorar");
      todo.adiconarTarefa("Beber agua");
      System.out.println(todo.obterNumeroTotalTarefas());
      todo.removerTarefa("namorar");
      todo.obterDescricoesTareafas();
    }
}