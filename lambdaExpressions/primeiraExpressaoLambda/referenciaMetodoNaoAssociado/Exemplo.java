package lambdaExpressions.primeiraExpressaoLambda.referenciaMetodoNaoAssociado;

import java.util.function.Function;

public class Exemplo {

    public static void main(String[] args) {

        Function<User, String> getName = User::getName;

        User anna = new User("Anna");

        String name = getName.apply(anna);

        


    }
}
