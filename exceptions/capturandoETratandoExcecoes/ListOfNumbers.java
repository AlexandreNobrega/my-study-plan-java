package capturandoETratandoExcecoes;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

    public void writeListStackTrace() throws IOException, IndexOutOfBoundsException {

        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("/home/alexandre/Área de Trabalho/OutFile.txt"));

            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace(System.out);
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

    public static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws java.io.IOException {

        java.nio.charset.Charset charset = StandardCharsets.US_ASCII;

        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        // Open zip file and create output file with
        // try-with-resources statement

        try ( java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
              java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)) {

            // Enumerate each entry
            for (java.util.Enumeration entries =
                 zf.entries(); entries.hasMoreElements();) {

                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;

                writer.write(zipEntryName, 0, zipEntryName.length());

            }
        }
    }

    //throws IOException, IndexOutOfBoundsException, informa que o método writeList pode lançar uma destas exceções
    public void writeList2() throws IOException, IndexOutOfBoundsException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }
}
