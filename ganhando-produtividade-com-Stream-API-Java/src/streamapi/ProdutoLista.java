package streamapi;

import java.util.Arrays;
import java.util.List;

public class ProdutoLista {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        ProdutoLista produtoLista = new ProdutoLista();

        int produto = produtoLista.numeros.stream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(produto);
    }

}
