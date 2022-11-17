package generics.restricaoGenericos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // compile-time error, tipos primitivos não são aceitos em tipos genéricos
        //Pair<int, char> p = new Pair<>(8, 'a');

        // Aceito
        //Pair<Integer, Character> pa = new Pair<>(8, 'a');

        List<Integer> integerList = new ArrayList<Integer>(0);

        Pair.rtti(integerList);

        // compile-time error, não é possível criar arrays de tipos parametrizados
        List<Integer>[] arrayOfLists = new List<Integer>[3];

    }
}
