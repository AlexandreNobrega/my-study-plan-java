package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleAddAll {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        boolean hasChanged = strings.addAll(first);

        System.out.println("Has strings changed? " + hasChanged);
        System.out.println("strings = " + strings);

    }
}
