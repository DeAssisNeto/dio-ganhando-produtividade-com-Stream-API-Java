package streamapi;

import java.util.Arrays;
import java.util.List;

public class ContemNegativo {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        ContemNegativo contemNegativo = new ContemNegativo();

        boolean isAnyNegative = contemNegativo.numeros.stream()
                .anyMatch(num -> num < 0);

        System.out.println(isAnyNegative);
    }

}
