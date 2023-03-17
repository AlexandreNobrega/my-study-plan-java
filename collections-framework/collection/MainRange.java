package collection;

public class MainRange {

    public static void main(String[] args) {

        for (int i : new Range(0, 5)) {
            System.out.println("i = " + i);
        }
    }
}
