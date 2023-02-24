package alura;

public class TestaTrataException2 {

    public static void metodo1() {
        System.out.println("primeiro antes");

        try {
            metodo2();
            System.out.println("primeiro depois");
        } catch (NullPointerException e) {
            System.out.println("tratei");
        }
        System.out.println("fim do metodo 1");
    }

    private static void metodo2() {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }

    public static void main(String[] args) {
        metodo1();
    }
}
