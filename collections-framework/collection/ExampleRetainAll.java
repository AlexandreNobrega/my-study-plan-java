package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleRetainAll {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> toBeRetained = new ArrayList<>();
        toBeRetained.add("one");
        toBeRetained.add("four");

        boolean hasChanged = strings.retainAll(toBeRetained);

        System.out.println("Has strings changed? " + hasChanged);
        System.out.println("strings = " + strings);

    }
}
