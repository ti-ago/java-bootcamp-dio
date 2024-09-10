package list.ordenacao.ordenacaoPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Tiago", 20, 1.56f);
        ordenacaoPessoa.adicionarPessoa("Edilaine", 32, 1.50f);
        ordenacaoPessoa.adicionarPessoa("Flor", 25, 1.80f);
        ordenacaoPessoa.adicionarPessoa("Levi", 12, 1.70f);
        ordenacaoPessoa.adicionarPessoa("Luara", 25, 1.30f);

        System.out.println(ordenacaoPessoa.getPessoaList());

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }
}
