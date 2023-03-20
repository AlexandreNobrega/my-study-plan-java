package collection;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExampleSortedSet {

    public static void main(String[] args) {

        SortedSet<String> strings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));

        SortedSet<String> subSet = strings.subSet("bbb", "e");

        System.out.println("sub set = " + subSet);

    }
}
