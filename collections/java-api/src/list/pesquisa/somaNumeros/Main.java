package list.pesquisa.somaNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(32);
        somaNumeros.adicionarNumero(33);
        somaNumeros.adicionarNumero(34);
        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(36);
        somaNumeros.adicionarNumero(33);
        somaNumeros.adicionarNumero(22);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}
