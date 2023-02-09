package capturandoETratandoExcecoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {

        ListOfNumbers listOfNumbers = new ListOfNumbers();

        listOfNumbers.writeList();

        String firstLine = listOfNumbers.readFirstLineFromFile("/home/alexandre/Área de Trabalho/OutFile.txt");

        System.out.println(firstLine);

    }
}
