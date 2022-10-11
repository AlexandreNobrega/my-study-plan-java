package generics.curingas.ilimitados;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        List<Boolean> lb = Arrays.asList(true, false, true);

        MyClass.printList(li);
        MyClass.printList(ls);
        MyClass.printList(lb);

    }
}
