package lambdaExpressions.primeiraExpressaoLambda.funcoesEspecializadas;

import java.util.function.BiFunction;

public class ExampleBiFunction {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> findWordInSentence =
                (letra, palavra) -> palavra.indexOf(letra);

        Integer setenceWord = findWordInSentence.apply("r", "alexandre");

        System.out.println(setenceWord);

    }
}
