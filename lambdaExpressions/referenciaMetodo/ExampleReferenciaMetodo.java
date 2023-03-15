package lambdaExpressions.primeiraExpressaoLambda.referenciaMetodo;

import java.util.function.Consumer;

public class ExampleReferenciaMetodo {

    public static void main(String[] args) {

        Consumer<String> printer = s -> System.out.println(s);

        printer.accept("Alexandre");

        //Utilizando Referência de Método
        Consumer<String> printerReferenceMethod = System.out::println;

        printerReferenceMethod.accept("Walter");

    }
}
