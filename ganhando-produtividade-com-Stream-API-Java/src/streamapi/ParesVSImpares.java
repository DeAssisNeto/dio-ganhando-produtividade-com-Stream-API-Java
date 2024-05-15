package streamapi;

import java.util.Arrays;
import java.util.List;

public class ParesVSImpares {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "ParesVSImpares{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        ParesVSImpares paresVSImpares = new ParesVSImpares();

        List<Integer> pares = paresVSImpares.numeros.stream()
                .filter(num -> num %2 == 0)
                .toList();

        List<Integer> impares = paresVSImpares.numeros.stream()
        .filter(num -> num %2 != 0)
        .toList();

        System.out.println(pares);
        System.out.println(impares);

    }
}
