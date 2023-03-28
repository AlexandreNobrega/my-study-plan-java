package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleReverse {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

        System.out.println("Lista antes de ser invertida: " + lista);//[0, 1, 2, 3, 4]

        Collections.reverse(lista);

        System.out.println("Lista depois de ser invertida: " + lista);//[4, 3, 2, 1, 0]

    }
}
