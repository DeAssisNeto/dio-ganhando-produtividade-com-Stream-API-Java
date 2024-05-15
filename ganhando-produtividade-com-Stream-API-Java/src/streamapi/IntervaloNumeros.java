package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntervaloNumeros {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    @Override
    public String toString() {
        return "IntervaloNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        IntervaloNumeros  intervaloNumeros = new IntervaloNumeros();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um intevalo de números para filtrar a lista.");
        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();



        List<Integer> intervalo = intervaloNumeros.numeros.stream()
                .filter(num -> num > num1 && num < num2)
                .toList();

        System.out.println(intervalo);
    }

}
