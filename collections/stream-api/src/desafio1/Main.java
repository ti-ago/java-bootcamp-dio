package desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(ordenarLista(numeros));

    }

    public static List<Integer> ordenarLista(List<Integer> lista) {
        List<Integer> listaOrdenada = lista;
        if(listaOrdenada.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        return listaOrdenada.stream().sorted().collect(Collectors.toList());

    }
}


