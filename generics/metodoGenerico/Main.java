package generics.metodoGenerico;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");

        Util util = new Util();

        //Com tipo inferido
        boolean same = Util.<Integer, String>compare(p1, p2);

        //Sem Tipo Inferido
        boolean same2 = Util.<Integer, String>compare(p1, p2);

        System.out.println(same2);

    }
}
