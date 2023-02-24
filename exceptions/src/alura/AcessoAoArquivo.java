package alura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AcessoAoArquivo {

    InputStream is = new FileInputStream("a.txt");

    AcessoAoArquivo() throws FileNotFoundException {

    }
}
