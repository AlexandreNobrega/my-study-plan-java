package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLambda {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Alexandre", "Walter", "Thomas");

        list.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Com Lambda
        list.forEach(s -> System.out.println("Com Lambda: " + s));

        //Com Lambda Method Reference
        list.forEach(System.out::println);

    }
}
