package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleImutavel {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("0", "1", "2", "3", "4");

        List<String> immutableStrings = Collections.unmodifiableList(strings);

        immutableStrings.add("5"); //UnsupportedOperationException
    }
}
