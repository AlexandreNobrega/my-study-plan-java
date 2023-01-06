package lambdaExpressions.primeiraExpressaoLambda.usandoExpressaoLambda;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

     /* Supplier<String> supplier = () -> "Hello Duke!";

        System.out.println(supplier.get());*/

        Random random = new Random(314L);
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        for (int index = 0; index < 5; index++) {
            System.out.println(newRandom.get() + " ");
        }


    }

}
