package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ExampleCopyOf {

    public static void main(String[] args) {

        Collection<String> strings = Arrays.asList("one", "two", "three");

        List<String> list = List.copyOf(strings);

        Set<String> set = Set.copyOf(strings);

        System.out.println("List: ");

        list.forEach(System.out::println);

        System.out.println("\nSet: ");

        set.forEach(System.out::println);

    }
}
