package generics.curingasSubtipagem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<? extends Integer> listInteger = new ArrayList<>();

        // TODO: OK. List<? extends Integer> é um subtipo de <? extends Number>
        List<? extends Number> listNumber = listInteger;

        // TODO: OK List<? extends Number> é um subtipo de List<?>
        List<?> listInteger2 = listNumber;

    }
}
