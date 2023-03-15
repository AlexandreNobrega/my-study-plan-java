package lambdaExpressions.primeiraExpressaoLambda.biPredicate;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {

    public static void main(String[] args) {

        BiPredicate<String, Integer> ifOfLength = (word, length) -> word.length() == length;

        String word = "Alexandre";

        int length = 9;

        boolean isWordOfLength9 = ifOfLength.test(word, length);

        System.out.println("Is Word of Length is 9? " + isWordOfLength9);

    }
}
