package streamapi;

import java.util.Arrays;
import java.util.List;

public class FiltrarPrimos {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "FiltrarPrimos{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        FiltrarPrimos filtrarPrimos = new FiltrarPrimos();

        List<Integer> primos = filtrarPrimos.numeros.stream()
                .filter(num -> num == 2 || num % 2 != 0 && num != 1
                        && (num == 3 || num % 3 != 0) && (num == 5 || num % 5 != 0) && (num == 7 || num % 7 != 0))
                .toList();
        System.out.println(primos);
    }


}
