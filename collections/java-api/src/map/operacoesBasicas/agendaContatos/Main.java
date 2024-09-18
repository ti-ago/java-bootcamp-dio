package map.operacoesBasicas.agendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Tiago", 1111);
        agenda.adicionarContato("Julian", 2222);
        agenda.adicionarContato("Rene", 222223);
        agenda.adicionarContato("Rene", 3333);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Tiago"));
    }
}
