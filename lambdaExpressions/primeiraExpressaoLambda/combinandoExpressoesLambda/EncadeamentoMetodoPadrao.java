package lambdaExpressions.primeiraExpressaoLambda.combinandoExpressoesLambda;

import java.util.function.Consumer;
import java.util.logging.Logger;

public class EncadeamentoMetodoPadrao {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyApplicationLogger");
        Consumer<String> log = message -> logger.info(message);
        Consumer<String> print = message -> System.out.println(message);

        Consumer<String> printAndLog = log.andThen(print);

        printAndLog.accept("Alexandre");

    }
}
