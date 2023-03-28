package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleRotate {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("0", "1", "2", "3", "4");

        System.out.println(strings); //[0, 1, 2, 3, 4]

        int fromIndex = 1, toIndex = 4;

        Collections.rotate(strings.subList(fromIndex, toIndex), -1);

        System.out.println(strings); //[0, 2, 3, 1, 4]

    }
}
