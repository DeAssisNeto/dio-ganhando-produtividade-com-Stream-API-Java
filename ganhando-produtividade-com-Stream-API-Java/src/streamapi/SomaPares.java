package streamapi;

import java.util.Arrays;
import java.util.List;

public class SomaPares {
     private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



    public static void main(String[] args) {
        SomaPares somaPares = new SomaPares();
        int soma = somaPares.numeros.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum();

        System.out.println(soma);
    }

}
