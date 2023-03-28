package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleSort {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("Walter White", "Thomas Shelby", "Alexandre Nobrega"));

        System.out.println("Lista antes da ordenação: " + lista);

        Collections.sort(lista);

        System.out.println("Lista após a ordenação: " + lista);

    }
}
