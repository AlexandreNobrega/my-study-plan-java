package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExemploValoresNulos {

    public static void main(String[] args) {

        //Exemplo comum em lambda para colocar valores nulos no final de uma lista
        /*Comparator<Integer> comparator =
                (i1, i2) -> {
                    if (i1 == null && i1 != null) {
                        return 1;
                    } else if (i1 != null && i2 == null) {
                        return -1;
                    } else {
                        return Integer.compare(i1, i2);
                    }
                };

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, null, 5, null, 6);

        integers.sort(comparator);

        System.out.println(integers);*/

        //Exemplo com método de fábrica nullLast()
        List<String> strings = Arrays.asList("one", null, "two", "three", null, null, "four", "five");

        Comparator<String> naturalNullsLast = Comparator.nullsLast(Comparator.naturalOrder());

        strings.sort(naturalNullsLast);

        System.out.println(strings);

    }
}
