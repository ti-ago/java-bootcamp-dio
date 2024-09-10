package set.pesquisa.agenda;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContatos();
        agenda.adicionarContatos("Tiago", 982989377);
        agenda.adicionarContatos("Tiugo", 981771249);
        agenda.adicionarContatos("Teago", 981361669);
        agenda.adicionarContatos("Tiafo", 992198169);
        agenda.adicionarContatos("Tiego", 981597730);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Tiago"));
        agenda.atualizarNumeroContato("Tiago", 999999999);
        agenda.exibirContatos();
    }
}
