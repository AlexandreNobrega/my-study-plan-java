package generics.tiposDestinoArgumentoMetodo;

import java.util.concurrent.Callable;

public class MyClass {

    void invoke(Runnable r) {
        r.run();
    }

    <T> T invoke(Callable<T> c) throws Exception {
        return c.call();
    }
}
