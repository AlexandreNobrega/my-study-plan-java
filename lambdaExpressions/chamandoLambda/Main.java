package lambdaExpressions.primeiraExpressaoLambda.chamandoLambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ale");
        list.add("Ted");
        list.add("João");
        list.add("Maria");

        ChamandoLambda chamandoLambda = new ChamandoLambda();

        System.out.println(chamandoLambda.retainStringsOfLength3(list));

    }
}
