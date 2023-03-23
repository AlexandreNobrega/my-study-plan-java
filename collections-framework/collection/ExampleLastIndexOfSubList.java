package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleLastIndexOfSubList {

    public static void main(String[] args) {

        List<Integer> listaPrincipal = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3));

        List<Integer> listaProcurada = new ArrayList<>(Arrays.asList(3));

        int indice = Collections.lastIndexOfSubList(listaPrincipal, listaProcurada);

        System.out.println("O índice da primeira ocorrência da sublista é: " + indice);



    }
}
