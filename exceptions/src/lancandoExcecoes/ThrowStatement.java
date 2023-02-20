package lancandoExcecoes;

import java.io.IOException;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowStatement {

    int tamanho;
    List<Integer> list = Arrays.asList(1);

    int size = list.size() - 1;

    public int pop() {

        if (size == 0) {
            throw new EmptyStackException();
        }

        return 0;
    }

    public String returnName(String name) {
        try {
            int tamanho = name.length();
        } catch (NullPointerException e) {
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                System.err.println(elements[i].getFileName()
                        + ":" + elements[i].getLineNumber()
                        + ">> "
                        + elements[i].getMethodName() + "()");
            }
            throw new NullPointerException("Mensagem de Erro: " + e.getCause());
        }
           return name;
    }

    public static void fileLog(String name) {

        try {
            name.length();
            Handler handler = new FileHandler("OutFile.log");
            Logger.getLogger("").addHandler(handler);
        } catch (IOException e) {
            Logger logger = Logger.getLogger("package.name");
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                logger.log(Level.WARNING, elements[i].getMethodName());
            }
        }
    }
}