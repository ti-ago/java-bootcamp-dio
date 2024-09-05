package list.operacoesBasicas.carrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("banana", 1.45, 12);
        carrinhoDeCompras.adicionarItem("manga", 2.45, 3);
        carrinhoDeCompras.adicionarItem("melancia", 45, 1);

        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("bananA");
        carrinhoDeCompras.removerItem("mangA");
        carrinhoDeCompras.removerItem("melanCia");
        carrinhoDeCompras.removerItem("melanCia");

    }
}
