package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleClear {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();

        strings.add("one");
        strings.add("two");

        System.out.println("The number of elements in strings in " + strings.size());
        strings.clear();
        System.out.println("After clearing it, this number is now " + strings.size());

    }
}
