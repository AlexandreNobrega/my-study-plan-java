package lambdaExpressions.primeiraExpressaoLambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Teste teste = new Teste();

        Predicate<String> predicate = (String s) -> {
            return s.length() == 3;
        };

        //Simplificado
        Predicate<String> predicateSimplificado = s -> s.length() == 3;

        boolean result = predicateSimplificado.test("asds");

        System.out.println(result);

        Consumer<String> print = s -> System.out.println(s);

        //Executável

        Runnable runnable = () -> System.out.println("I am running");



    }
}
