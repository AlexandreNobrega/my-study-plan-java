package generics.curingas.ilimitados;

import java.util.List;

public class MyClass {

    public static void printList(List<?> list) {

        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
}
