package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaior {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        SegundoMaior segundoMaior = new SegundoMaior();

        Integer segundMaior = segundoMaior.numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(segundMaior);
    }

}
