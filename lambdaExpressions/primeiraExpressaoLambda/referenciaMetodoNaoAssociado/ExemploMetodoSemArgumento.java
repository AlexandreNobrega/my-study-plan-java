package lambdaExpressions.primeiraExpressaoLambda.referenciaMetodoNaoAssociado;

import java.util.function.BiFunction;

public class ExemploMetodoSemArgumento {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> indexOf = (setence, word) -> setence.indexOf(word);

        int result = indexOf.apply("alexandre", "n");

        System.out.println(result);

        //Exemplo com referência de método
        BiFunction<String, String, Integer> indexOfReference = String::indexOf;

        int resultRerefence = indexOfReference.apply("Alexandre Nobrega", "b");

        System.out.println(resultRerefence);

    }
}
