package generics.metodosAuxiliaresCapturaCuringa;

import java.util.List;

public class WildCardErrorBad {

    void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {

        Number temp = l1.get(0);

        // TODO: É claramente incorreto pegar uma lista de Integer valores
        //  e tentar adicionar em uma lista de Double valores.
        l1.set(0, l2.get(0));

        l2.set(0, temp);

    }
}
