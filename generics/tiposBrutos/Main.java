package generics.tiposBrutos;

public class Main {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box rawBox = new Box();

        Box<String> stringBox = new Box<>();
        rawBox = stringBox;               // OK

    }
}
