package generics.tiposBrutos;

public class MainBox {

    public static void main(String[] args) {

        //TODO: Exemplo tipo parametrizado
        Box<Integer> intBox = new Box<>();

        //TODO: Exemplo tipo bruto, comportamento pré genérico
        Box rawBox = new Box();

        //TODO: É possível atribuir um tipo parametrizado há um bruto
        Box rawBox2 = intBox;

        //TODO: Não é possível atribuir um tipo bruto há um parametrizado
        //Box<Integer> intBox = rawBox; warning: unchecked conversion

        Box<String> stringBox = new Box<>();
        Box rawBox3 = stringBox;

        rawBox3.set(8);

    }
}
