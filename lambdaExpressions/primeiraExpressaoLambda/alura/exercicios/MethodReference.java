package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Alexandre");
        list.add("Thommas");
        list.add("Walter");

        //list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //list.sort(Comparator.comparing(s -> s.length()));

        //Exemplo equivalente ao acima
        //Comparator<String> comparador = Comparator.comparing(s -> s.length());
        //list.sort(comparador);

        //Exemplo como funciona a expressao lambda: list.sort(Comparator.comparing(s -> s.length()))
        //Function<String, Integer> funcao = s -> s.length();
        //Comparator<String> comparador2 = Comparator.comparing(funcao);
        //list.sort(comparador2);

        //Exemplo com method reference
        list.sort(Comparator.comparing(String::length));

        list.forEach(System.out::println);

    }
}
