package generics.restricaoGenericos;

import java.util.List;

public class Pair {

/*    //Não é possível declarar campos estáticos cujos tipos são parâmetros de tipo
    private static T os; //compile-time error

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //Não é possível criar instâncias de parâmetros de tipo
    public statis <E> void append(List<E> list) {
        E elem = new E(); //compile-time error
        list.add(elem);
    }*/

    public static void rtti(List<Integer> list) {
        if (list instanceof List<Integer>) {
            System.out.println("Passou...");
        }
    }

}
