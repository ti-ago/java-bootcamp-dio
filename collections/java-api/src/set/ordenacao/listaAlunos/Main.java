package set.ordenacao.listaAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos lista = new GerenciadorAlunos();
        lista.adicionarAluno("Tiago",1L,10);
        lista.adicionarAluno("Tiego",2L,9);
        lista.adicionarAluno("Tiogo",3L,11);
        lista.adicionarAluno("Tiugo",4L,12);
        lista.exibirAlunos();
        System.out.println(lista.exibirAlunosPorNome());
        System.out.println(lista.exibirAlunosPorNota());

    }
}
