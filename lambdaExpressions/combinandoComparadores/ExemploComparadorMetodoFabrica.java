package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import java.util.Comparator;
import java.util.function.Function;

public class ExemploComparadorMetodoFabrica {

    public static void main(String[] args) {

        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        int result = comparator.compare("Alexandre", "Nobregaaaaaa");

        System.out.println(result);

        //Exemplo com encadeamento
        Function<String, Integer> toLength = String::length;
        Comparator<String> comparator2 = (s1, s2) -> Integer.compare(toLength.apply(s1),
                                                                    toLength.apply(s2));

        int result2 = comparator2.compare("Alexandre", "Nobrega");

        System.out.println(result2);

        //Exemplo com método de fábrica
        Comparator<String> comparator3 = Comparator.comparing(String::length);

        int result3 = comparator3.compare("aaa", "bb");

        System.out.println(result3);


    }
}
