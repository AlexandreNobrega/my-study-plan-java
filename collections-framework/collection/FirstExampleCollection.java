package collection;

import java.util.ArrayList;
import java.util.Collection;

public class FirstExampleCollection {

    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println("strings = " + strings);
        strings.remove("one");
        System.out.println("strings = " + strings);

    }
}
