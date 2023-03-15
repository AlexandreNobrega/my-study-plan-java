package lambdaExpressions.primeiraExpressaoLambda;

import java.util.function.Predicate;

public class Teste {

    Predicate<String> predicate = (String s) -> {
        return s.length() == 3;
    };

    //Simplificado
    Predicate<String> predicateSimplificado = s -> s.length() == 3;

}
