package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TodosIguais {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        TodosIguais todosIguais = new TodosIguais();
        List<Integer> numeros = todosIguais.numeros.stream()
                .distinct()
                .toList();

        boolean isIgual = 1 == numeros.size();

        System.out.println(isIgual);
    }

}
