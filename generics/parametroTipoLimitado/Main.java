package generics.parametroTipoLimitado;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();

        integerBox.set(new Integer(10));

        //integerBox.inspect("some text");// error só aceita valor do tipo Number

        integerBox.inspect(20);

    }
}
