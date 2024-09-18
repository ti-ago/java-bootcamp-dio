package desafio3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Boolean positivos = numeros.stream().allMatch(n -> n > 0);

        if(positivos) {
            System.out.println("Todos positivos");
        } else {
            System.out.println("Não são todos positivos");
        }
    }
}
