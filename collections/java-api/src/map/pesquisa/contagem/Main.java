package map.pesquisa.contagem;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Tiago" ,2);
        contagem.adicionarPalavra("Tiago" ,12);
        System.out.println(contagem.exibirContagemPalavra());
    }
}
