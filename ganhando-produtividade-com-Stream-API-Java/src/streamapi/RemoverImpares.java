package streamapi;

import java.util.Arrays;
import java.util.List;

public class RemoverImpares {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        RemoverImpares removerImpares = new RemoverImpares();
        List<Integer> numerosPares = removerImpares.numeros.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println(numerosPares);

    }

}
