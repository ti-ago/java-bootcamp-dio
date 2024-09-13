package set.ordenacao.cadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        cadastroProdutos.adicionarProduto(0001, "fuba", 1.55, 23);
        cadastroProdutos.adicionarProduto(02, "fubi", 1.56, 33);
        cadastroProdutos.adicionarProduto(0021, "fobu", 1.57, 34);
        cadastroProdutos.adicionarProduto(0001, "fabe", 1.60, 42);
        cadastroProdutos.adicionarProduto(7, "fibo", 1, 13);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
    }
}
