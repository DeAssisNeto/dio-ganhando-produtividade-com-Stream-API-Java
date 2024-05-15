package streamapi;

import java.util.Arrays;
import java.util.List;

public class SomaDivisiveis3e5 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        SomaDivisiveis3e5 somaDivisiveis3e5 = new SomaDivisiveis3e5();

        int soma = somaDivisiveis3e5.numeros.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(soma);
    }

}
