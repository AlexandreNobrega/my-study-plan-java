package generics.tiposDestinoArgumentoMetodo;

public class Main {

    public static void main(String[] args) throws Exception {

        MyClass myClass = new MyClass();

        String s = myClass.invoke(() -> "done");

        System.out.println(s);

    }
}
