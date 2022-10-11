package generics.curingas.limiteSuperior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.1);
        doubleList.add(10.2);
        doubleList.add(10.3);
        doubleList.add(10.4);

        //myClass.process(doubleList);

        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + MyClass.sumOfList(li));

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + MyClass.sumOfList(ld));

    }
}
