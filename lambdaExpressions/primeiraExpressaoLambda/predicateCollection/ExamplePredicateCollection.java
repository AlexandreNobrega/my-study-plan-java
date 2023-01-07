package lambdaExpressions.primeiraExpressaoLambda.predicateCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicateCollection {


    public static void main(String[] args) {

        List<String> immutableStrings = List.of("one", "two", "three", "four", "five");

        List<String> strings = new ArrayList<>(immutableStrings);

        Predicate<String> isOddLength = s -> s.length() % 2 == 0;

        strings.removeIf(isOddLength);

        System.out.println("string = " + strings);

    }
}
