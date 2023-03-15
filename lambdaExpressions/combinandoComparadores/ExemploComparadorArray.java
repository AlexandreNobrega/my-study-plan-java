package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import lambdaExpressions.primeiraExpressaoLambda.referenciaMetodoNaoAssociado.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExemploComparadorArray {

    public static void main(String[] args) {

        User user1 = new User("aaaaaaaaaa");
        User user2 = new User("cccccc");
        User user3 = new User("ddddddddddddddddddddddddddd");

        List<User> users = Arrays.asList(user1, user2, user3);

        Comparator<User> byName = Comparator.comparing(User::getName);

        users.sort(byName);

        users.forEach(s -> System.out.println(s.getName()));

    }
}
