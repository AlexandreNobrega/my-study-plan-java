package lambdaExpressions.primeiraExpressaoLambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExemploIteravel {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Alexandre");
        strings.add("Jhon Snow");
        strings.add("Walter White");

        Consumer<String> printer = (String s) -> System.out.println(s);

        strings.forEach(printer);

    }
}
