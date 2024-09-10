package set.operacoesBasicas.palavras;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Tiago");
        conjunto.adicionarPalavra("Tiago");
        conjunto.adicionarPalavra("Tiugo");
        conjunto.adicionarPalavra("Tiogo");

        conjunto.exibirPalavrasUnicas();
        System.out.println(conjunto.verificarPalavra("Tiego"));
        conjunto.removerPalavra("Tiago");
        conjunto.exibirPalavrasUnicas();
    }
}
