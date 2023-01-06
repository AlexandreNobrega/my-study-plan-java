package lambdaExpressions.primeiraExpressaoLambda.consumer;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class Main {

    public static void main(String[] args) {

        Random random = new Random(314L);

        IntSupplier newRandom = () -> random.nextInt();

        Consumer<String> printer = s -> System.out.println(s);

        for (int i = 0; i< 5; i++) {
            int nextRandom = newRandom.getAsInt();
            printer.accept("next random = " + nextRandom);
        }
    }
}
