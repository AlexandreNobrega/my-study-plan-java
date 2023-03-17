package collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleVarious {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));

        strings.add(6, "6");

        System.out.println("value indice 6 from list " + strings.get(6));

        strings.set(6, "9");

        System.out.println("value index 6 after changed " + strings.get(6));

        strings.remove(6);

        System.out.println(strings);
        strings.subList(2, 5).clear();
        System.out.println(strings);

    }
}
