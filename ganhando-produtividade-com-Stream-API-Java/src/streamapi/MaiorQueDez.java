package streamapi;

import java.util.Arrays;
import java.util.List;

public class MaiorQueDez {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        MaiorQueDez maiorQueDez = new MaiorQueDez();

        boolean isMaiorQueDez = maiorQueDez.numeros.stream()
                .anyMatch(num -> num > 10);
        System.out.println(isMaiorQueDez);
    }

}
