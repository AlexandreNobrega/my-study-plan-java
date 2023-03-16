package collection;

import java.util.Arrays;
import java.util.Collection;

public class ExampleToArray {

    public static void main(String[] args) {

        Collection<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eigth",
                                                   "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen");

        String[] tabString1 = strings.toArray(new String[] {});
        String[] tabString2 = strings.toArray(new String[15]);

        strings.forEach(System.out::println);

        for (String t1 : tabString1) {
            System.out.println(t1);
        }
    }
}
