package collection;

import java.util.Arrays;
import java.util.Collection;

public class ExampleToArrayReferenceMethod {

    public static void main(String[] args) {

        Collection<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eigth",
                "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen");

        String[] tabString3 = strings.toArray(String[]::new);

        for (String t3 : tabString3) {
            System.out.println(t3);
        }
    }
}
