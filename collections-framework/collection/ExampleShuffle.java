package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleShuffle {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("Walter White", "Thomas Shelby", "Jhon Snow", "Alexandre"));

        System.out.println("Lista antes do embaralhamento " + lista);

        Collections.shuffle(lista);

        System.out.println("Lista depois do embaralhamento " + lista);

    }
}
