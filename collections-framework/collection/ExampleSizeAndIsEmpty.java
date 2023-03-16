package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleSizeAndIsEmpty {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        if (!strings.isEmpty()) {
            System.out.println("Indeed strings in not empty");
        }

        System.out.println("The number of elements in strings is " + strings.size());

    }
}
