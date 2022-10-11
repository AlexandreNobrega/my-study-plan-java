package generics.metodosAuxiliaresCapturaCuringa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3);

        List<Double> ld = Arrays.asList(10.10, 20.20, 30.30);

        WildCardErrorBad wildCardErrorBad = new WildCardErrorBad();

        wildCardErrorBad.swapFirst(li, ld);

    }
s}
