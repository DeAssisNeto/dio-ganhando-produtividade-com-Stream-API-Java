package streamapi;


import java.util.Arrays;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        var numerosOrdenados = ordenacaoNumeros.numeros.stream().sorted().toList();
        System.out.println(numerosOrdenados);

    }

}