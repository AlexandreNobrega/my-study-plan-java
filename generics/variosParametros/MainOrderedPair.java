package generics.variosParametros;

import generics.Box;

import java.util.List;

public class MainOrderedPair {

    public static void main(String[] args) {

        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        OrderedPair<String, Integer> p3 = new OrderedPair<>("Alexander", 9);
        OrderedPair<String, String> p4 = new OrderedPair<>("generics", "java");

        Box<Integer> b = new Box<Integer>();

        b.setT(1);

        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

        System.out.println(p.getKey());
        System.out.println(p.getValue());

/*        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        System.out.println(p4.getKey());
        System.out.println(p4.getValue());*/



    }
}
