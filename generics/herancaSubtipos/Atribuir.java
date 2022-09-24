package generics.herancaSubtipos;

public class Atribuir {

    public static void main(String[] args) {

        Object someObject = new Object();
        Integer someInteger = new Integer(10);

        someObject = someInteger; //OK

        someMethod(new Integer(10));
        someMethod(new Double(10.1));

        Box<Number> box = new Box<Number>();
        Box<Integer> boxInteger = new Box<Integer>();

        box.add(new Integer(10));
        box.add(new Double(10.1));

        // box.boxTest(boxInteger); //Erro: por mais que Integer seja subtipo de Number, neste exemplo não é possível atribuir

    }

    public static void someMethod(Number n) {

    }



}
