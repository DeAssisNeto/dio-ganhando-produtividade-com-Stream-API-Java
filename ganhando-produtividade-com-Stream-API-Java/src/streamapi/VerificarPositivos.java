package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarPositivos {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    @Override
    public String toString() {
        return "VerificarPositivos{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        VerificarPositivos verificarPositivos = new VerificarPositivos();
        boolean todosPositivos = verificarPositivos.numeros.stream()
                .allMatch(num -> num > 0);
        System.out.println(todosPositivos);

    }

}
