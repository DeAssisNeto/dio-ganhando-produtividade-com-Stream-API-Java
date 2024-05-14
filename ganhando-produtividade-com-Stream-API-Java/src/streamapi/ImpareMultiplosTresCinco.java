package streamapi;

import java.util.Arrays;
import java.util.List;

public class ImpareMultiplosTresCinco {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        ImpareMultiplosTresCinco impareMultiplosTresCinco = new ImpareMultiplosTresCinco();

        Integer numerosAgrupar = impareMultiplosTresCinco.numeros.stream()
                .filter(num -> (num % 2 != 0 && (num % 3 == 0 || num % 5 == 0)))
                .reduce(0, Integer::sum);

        System.out.println(numerosAgrupar);
    }

}
