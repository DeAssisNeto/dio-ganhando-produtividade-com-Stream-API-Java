package streamapi;

import java.util.Arrays;
import java.util.List;

public class TodosDistintos {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        TodosDistintos todosDistintos = new TodosDistintos();


        List<Integer> listaSemRepeticoes = todosDistintos.numeros.stream()
                .distinct()
                .toList();

        boolean isNumerosDistintos = todosDistintos.numeros.size() == listaSemRepeticoes.size();
        System.out.println(isNumerosDistintos);
    }

}
