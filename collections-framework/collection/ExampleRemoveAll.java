package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleRemoveAll {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> toBeRemoved = new ArrayList<>();
        toBeRemoved.add("one");
        toBeRemoved.add("two");

        boolean hasChanged = strings.removeAll(toBeRemoved);

        System.out.println("Has strings changed? " + hasChanged);
        System.out.println("strings = " + strings);

    }
}
