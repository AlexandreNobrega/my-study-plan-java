package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MetodoSort {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Alexandre");
        list.add("Walter");
        list.add("Thommas");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });

        list.forEach(System.out::println);

        //Exemplo com Lambda
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println();

        list.forEach(s -> System.out.println("Com Lambda: " + s));

        //Outro exemplo que também funciona é subtraindo
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println();

        list.forEach(s -> System.out.println("Exemplo Subtração: " + s));

    }
}
