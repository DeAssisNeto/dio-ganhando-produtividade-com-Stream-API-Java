package streamapi;

import java.util.Arrays;
import java.util.List;

public class CalcularMedia {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        CalcularMedia calcularMedia = new CalcularMedia();

        double soma = calcularMedia.numeros.stream()
                .filter(num -> num > 5)
                .reduce(0, Integer::sum);

        long quantidadeNumeros = calcularMedia.numeros.stream()
                .filter(num -> num >5)
                .count();

        System.out.println(soma/quantidadeNumeros);
    }

}
