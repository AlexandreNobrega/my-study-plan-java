package capturandoETratandoExcecoes;

import lancandoExcecoes.ThrowStatement;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {


       ListOfNumbers listOfNumbers = new ListOfNumbers();

        listOfNumbers.writeListStackTrace();

        /*String firstLine = listOfNumbers.readFirstLineFromFile("/home/alexandre/Área de Trabalho/OutFile.txt");

        System.out.println(firstLine);

        ListOfNumbers.writeToFileZipFileContents("/home/alexandre/Área de Trabalho/zipJavaException.zip", "/home/alexandre/Área de Trabalho/javaException.txt");

        ThrowStatement throwStatement = new ThrowStatement();

        int result = throwStatement.pop();

        System.out.println(result);


        ThrowStatement throwStatement = new ThrowStatement();

        String name = null;

        String result = throwStatement.returnName(name);

        System.out.println(result);


        ThrowStatement throwStatement = new ThrowStatement();

        String name = null;

        throwStatement.fileLog(name);*/


    }
}
