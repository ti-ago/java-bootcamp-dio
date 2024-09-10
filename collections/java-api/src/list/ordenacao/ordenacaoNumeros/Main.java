package list.ordenacao.ordenacaoNumeros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(32);
        numeros.adicionarNumero(23);
        numeros.adicionarNumero(11);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(54);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}
