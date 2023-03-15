package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleContainsAll {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> first = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        Collection<String> second = new ArrayList<>();
        strings.add("one");
        strings.add("four");

        System.out.println("Is first contained in strings? " + strings.containsAll(first));
        System.out.println("Is second contained in strings? " + strings.containsAll(second));

    }
}
