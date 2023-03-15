package lambdaExpressions.primeiraExpressaoLambda.funcoesEspecializadas;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class ExampleFuncoesEspecializadas {

    public static void main(String[] args) {

        Function<String, Integer> toLength = s -> s.length();

        UnaryOperator<String> unary;

        ToIntFunction<Integer> toInt;

        IntUnaryOperator intUnaryOperator;

        String word = "Alexandre";

        int length = toLength.apply(word);

        System.out.println(length);
    }
}
