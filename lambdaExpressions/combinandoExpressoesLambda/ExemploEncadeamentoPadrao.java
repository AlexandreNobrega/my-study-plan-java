package lambdaExpressions.primeiraExpressaoLambda.combinandoExpressoesLambda;

import java.util.Objects;
import java.util.function.Predicate;

/*
O exemplo abaixo refere-se ao encadeamento de métodos de uma forma padrão, com JDK e por meio de referencia de método
Serão feitos 3 testes:

- Não nulo
- Não vazio
- Menos de 5 caracteres
 */
public class ExemploEncadeamentoPadrao {

    public static void main(String[] args) {

        //Exemplo 1
        Predicate<String> p = s -> (s != null) && !s.isEmpty() && s.length() < 5;

        //Exemplo 2
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        Predicate<String> p2 = nonNull.and(nonEmpty).and(shorterThan5);

        //Exemplo 3 API, Referencia de método
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
        Predicate<String> shorterThan5_2 = s -> s.length() < 5;

        Predicate<String> p3 = isNotNullNorEmpty.and(shorterThan5_2);

        boolean result = p3.test("Ale");

        System.out.println(result);

    }
}
