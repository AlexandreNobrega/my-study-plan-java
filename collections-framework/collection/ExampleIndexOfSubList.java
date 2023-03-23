package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleIndexOfSubList {

    public static void main(String[] args) {

        List<Integer> listaPrincipal = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> listaProcurada = new ArrayList<>(Arrays.asList(3, 4, 5));

        int indice = Collections.indexOfSubList(listaPrincipal, listaProcurada);

        System.out.println("O índice da primeira ocorrência da sublista é: " + indice);

    }
}
