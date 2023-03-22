package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExampleMinMax {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int min = Collections.min(list);

        int max = Collections.max(list);

        System.out.println(min); //1

        System.out.println(max); //7

    }
}
