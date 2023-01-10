package lambdaExpressions.primeiraExpressaoLambda.combinandoExpressoesLambda;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicadoMetodoFabrica {

    public static void main(String[] args) {

        //isEqual é considerado um método de fábrica
        Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");

        boolean result = isEqualToDuke.test("Duke");

        System.out.println(result);

        //O exemplo abaixo nega o predicado fornececido como argumento no caso "isEmpty"
        Predicate<Collection<String>> isEmpty = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty);

    }
}
