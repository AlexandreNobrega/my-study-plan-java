package alura;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteTrataException {

    public static void main(String[] args) {
        String nome = null;

        //Exemplo com exceção não verificada
        try {
            nome.toLowerCase();
            System.out.println("Essa mensagem não será chamada/impressa, pois ocorre uma exceção e a execução já vai direto para o catch");
        } catch(NullPointerException e) {
            System.out.println("Peguei a exception não verificada");
        }
            System.out.println("Terminei");

            System.out.println();

        //Exemplo com exceção verificada
        try {
            new java.io.FileInputStream("a.txt");
            System.out.println("Essa mensagem não será chamada/impressa, pois ocorre uma exceção e a execução já vai direto para o catch");
        } catch(IOException e) {
            System.out.println("Peguei a exception verificada");
        }
            System.out.println("Terminei");

    }
}
