package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleSwap {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Lista antes da troca: " + lista); //[1, 2, 3, 4, 5]

        Collections.swap(lista, 1, 3);

        System.out.println("Lista após a troca: " + lista); //[1, 4, 3, 2, 5]

    }
}
