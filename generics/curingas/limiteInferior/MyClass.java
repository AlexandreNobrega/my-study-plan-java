package generics.curingas.limiteInferior;

import java.util.List;
import java.util.Objects;

public class MyClass {

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (Object elem : list)
            System.out.println(elem + " ");
    }
}
