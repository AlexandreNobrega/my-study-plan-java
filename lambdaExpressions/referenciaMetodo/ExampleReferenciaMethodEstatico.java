package lambdaExpressions.primeiraExpressaoLambda.referenciaMetodo;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;

public class ExampleReferenciaMethodEstatico {

    public static void main(String[] args) {

        DoubleUnaryOperator sqrt = a -> Math.sqrt(a);

        double result = sqrt.applyAsDouble(10);

        System.out.println(result);

        //Utilizando Referência de Método Estático
        DoubleUnaryOperator sqrtReference = Math::sqrt;

        double resultReference = sqrtReference.applyAsDouble(20);

        System.out.println(resultReference);

        //Exemplo com dois parametros
        IntBinaryOperator max = (a, b) -> Integer.max(a, b);

        int result2 = max.applyAsInt(10, 20);

        System.out.println(result2);

        //Utilizando Referência de Método com dois parâmetros
        IntBinaryOperator maxReference = Integer::max;

        int result3 = maxReference.applyAsInt(15, 25);

        System.out.println(result3);

    }
}
