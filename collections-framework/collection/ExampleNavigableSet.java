package collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleNavigableSet {

    public static void main(String[] args) {

        NavigableSet<String> sortedStrings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));

        System.out.println("sorted strings = " + sortedStrings);

        NavigableSet<String> reverserdStrings = sortedStrings.descendingSet();

        System.out.println("reversed strings = " + reverserdStrings);

    }
}
