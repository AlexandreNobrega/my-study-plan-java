package generics.curingas.limiteSuperior;

import java.util.List;

public class MyClass {

    public static void process(List<? extends Number> list) {

        for(Number elem : list) {
            System.out.println("Valores: " + elem);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;

        for (Number n : list)
            s += n.doubleValue();
        return s;

    }
}
