package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceInt {

    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);

        Predicate<Integer> isOddLength = s -> s % 2 != 0;

        listInteger.removeIf(isOddLength);

        listInteger.forEach(System.out::println);

    }
}
