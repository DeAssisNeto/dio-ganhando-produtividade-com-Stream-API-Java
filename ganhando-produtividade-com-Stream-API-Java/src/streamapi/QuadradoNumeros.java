package streamapi;

import java.util.Arrays;
import java.util.List;

public class QuadradoNumeros {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "QuadradoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        QuadradoNumeros quadradoNumeros = new QuadradoNumeros();

        List<Integer> quadrado = quadradoNumeros.numeros.stream()
                .map(num -> num*num).toList();

        System.out.println(quadrado);
    }

}
