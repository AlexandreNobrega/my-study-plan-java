package lambdaExpressions.primeiraExpressaoLambda.predicate;

import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {

        Predicate<String> length3 = s -> s.length() == 3;

        String word = "Ale";

        boolean isOfLength3 = length3.test(word);

        System.out.println("Is of length 3? " + isOfLength3);


    }
}
