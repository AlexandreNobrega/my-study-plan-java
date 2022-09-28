package generics.inferenciaTipo;

import java.util.List;

public class BoxDemo {

    public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
        Box<U> box = new Box<>();

        box.set(u);
        boxes.add(box);

    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;

        for (Box<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" +
                    boxContents.toString() + "]");
            counter++;
        }
    }



}
