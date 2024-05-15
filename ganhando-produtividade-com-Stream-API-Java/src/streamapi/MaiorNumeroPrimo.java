package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaiorNumeroPrimo {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "MaiorNumeroPrimo{" +
                "numeros=" + numeros +
                '}';
    }


    public static void main(String[] args) {
        MaiorNumeroPrimo maiorNumeroPrimo = new MaiorNumeroPrimo();

        int maiorNumero = maiorNumeroPrimo.numeros.stream()
                .filter(num -> num == 2 || num % 2 != 0 && num != 1
                        && (num == 3 || num % 3 != 0) && (num == 5 || num % 5 != 0) && (num == 7 || num % 7 != 0))
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(maiorNumero);
    }
}
