package generics.parametros.varios.tipos;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair("hello", "world");

        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());

    }
}
