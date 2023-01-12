package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import lambdaExpressions.primeiraExpressaoLambda.referenciaMetodoNaoAssociado.User;

import java.util.Comparator;

public class ExemploComparadoresEncadeamento {

    public static void main(String[] args) {

        Comparator<User> byFirstName = Comparator.comparing(User::getFirstName);
        Comparator<User> byLastName = Comparator.comparing(User::getLastName);

        Comparator<User> byFirstNameThenLastName = byFirstName.thenComparing(byLastName);

        User alexandre = new User();
        User walter = new User();

        alexandre.setFirstName("Alexandre");
        alexandre.setLastName("Nobrega");

        walter.setFirstName("Walter");
        walter.setLastName("White");

        int result = byFirstNameThenLastName.compare(walter, alexandre);

        System.out.println(result);

        //Exemplo com sobrecarga de método e encadeamento entre o método comparing() e thenComparing()
        Comparator<User> byFirstNameThenLastName2 = Comparator.comparing(User::getFirstName).thenComparing(User::getLastName);

        User thomas = new User();
        User ragnar = new User();

        thomas.setFirstName("Thomas");
        thomas.setLastName("Shelby");

        ragnar.setFirstName("Ragnar");
        ragnar.setLastName("Lothbrock");

        int result2 = byFirstNameThenLastName2.compare(ragnar, thomas);

        System.out.println(result2);

    }
}
