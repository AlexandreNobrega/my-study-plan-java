package lambdaExpressions.primeiraExpressaoLambda.predicate;

import java.sql.SQLOutput;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class ExamplePredicateTipo {

    public static void main(String[] args) {

        //Exemplo com Predicate<Integer>
        Predicate<Integer> isGreaterThan10 = i -> i > 10;

        boolean result = isGreaterThan10.test(9);

        System.out.println("Is Greater Than 10? " + result);

        //Exemplo com IntPredicate, retorna o mesmo resultado
        IntPredicate isGreaterThan11 = i -> i > 11;

        boolean result2 = isGreaterThan11.test(12);

        System.out.println("Is Greater Than 12? " + result2);

        //Exemplo com LongPredicate
        LongPredicate isGreaterThan12_000 = i -> i > 10000;

        boolean result3 = isGreaterThan12_000.test(10001);

        System.out.println("Is Greater Than 10000? " + result3);

    }
}
