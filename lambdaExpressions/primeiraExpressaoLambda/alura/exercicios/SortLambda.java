package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortLambda {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("CcCcCC");
        list.add("aAAAAA");
        list.add("BbbbbB");

      /*
      list.sort((s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
      */

        //list.sort(Comparator.comparing(s -> s.length()));

        //Exemplo com method reference
        /*list.sort(Comparator.comparing(String::length));

        list.forEach(System.out::println);*/

        System.out.println();

        list.sort(String.CASE_INSENSITIVE_ORDER);

        list.forEach(s -> System.out.println("Com String Case Sensitive: " + s));

    }
}
