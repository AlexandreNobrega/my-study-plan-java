package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExemploComparandoObjetoComparaveis {

    public static void main(String[] args) {

        Comparator<String> byLengthThenAlphabetucally = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        strings.sort(byLengthThenAlphabetucally); //[one, two, five, four, three]

        System.out.println(strings);

        //Exemplo reverse
        List<String> stringReverse = Arrays.asList("one", "two", "three", "four", "five");

        stringReverse.sort(byLengthThenAlphabetucally.reversed());

        System.out.println(stringReverse);


    }
}
