package capturandoETratandoExcecoes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ListOfNumbers {

    private List<Integer> list;

    // Create a Logger
    Logger logger = Logger.getLogger(ListOfNumbers.class.getName());
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writeList() throws IOException, IndexOutOfBoundsException {

        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("/home/alexandre/Área de Trabalho/OutFile.txt"));

            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }

        } catch (IOException | IndexOutOfBoundsException e) {
            LogRecord record = new LogRecord(Level.INFO, "ESSA É UMA MENSAGEM DE LOG CONTENDO ALGUMAS INFORMAÇÕES SOBRE A EXCEÇÃO");
            logger.log(record);
            throw e;
        } finally {
            System.out.println("Independente do que aconteça o bloco finally será executado");
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
