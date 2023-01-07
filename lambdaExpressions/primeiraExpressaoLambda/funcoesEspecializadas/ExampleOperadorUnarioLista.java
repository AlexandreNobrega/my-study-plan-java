package lambdaExpressions.primeiraExpressaoLambda.funcoesEspecializadas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExampleOperadorUnarioLista {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "tow", "three");

        UnaryOperator<String> toUpperCase = word -> word.toUpperCase();

        strings.replaceAll(toUpperCase);

        System.out.println(strings);
    }
}
