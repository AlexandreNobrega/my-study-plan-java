package generics.metodosAuxiliaresCapturaCuringa;

import java.util.List;

public class WildcardErrorFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    /* TODO: Método AUXILIAR de ajuda criado para que o curinga possa ser capturado
        através de inferência de tipo.*/
        private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}
