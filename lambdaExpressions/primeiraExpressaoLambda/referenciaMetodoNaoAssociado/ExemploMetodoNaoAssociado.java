package lambdaExpressions.primeiraExpressaoLambda.referenciaMetodoNaoAssociado;

import java.util.function.Function;

public class ExemploMetodoNaoAssociado {

    public static void main(String[] args) {

        Function<String, Integer> toLength = s -> s.length();

        int result = toLength.apply("Alexandre");

        System.out.println(result);

        //Exemplo referência de método
        Function<String, Integer> toLengthReference = String::length;

        int resultReference = toLengthReference.apply("Alex");

        System.out.println(resultReference);

        //User user = new User();

        //user.setName("Alexandre Nobrega");

        //Exemplo com método get
        Function<User, String> getName = u -> u.getName();

        //String userResult = getName.apply(user);

        //System.out.println(userResult);

        //Exemplo com método de referência com get
        //Function<String, Integer> toLengthReference2 = User::getName;

    }
}
