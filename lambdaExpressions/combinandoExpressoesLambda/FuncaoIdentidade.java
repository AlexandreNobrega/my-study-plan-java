package lambdaExpressions.primeiraExpressaoLambda.combinandoExpressoesLambda;

import java.util.function.Function;

public class FuncaoIdentidade {

    public static void main(String[] args) {

        Function<String, String> id = Function.identity();

        String result = id.apply("Alexandre");

        System.out.println(result);

    }
}
