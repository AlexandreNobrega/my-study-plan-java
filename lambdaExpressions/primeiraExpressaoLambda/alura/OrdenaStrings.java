package lambdaExpressions.primeiraExpressaoLambda.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        //Collections.sort(palavras);

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        //Collections.sort(palavras, comparador);

        palavras.sort(comparador); //comparando pelo quantidade de strings do menor para o maior, através do "comparador"

        //System.out.println(palavras);

        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);

    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {

    //Método utilizado para comparar pelo quantidade de strings do menor para o maior
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class ConsumidorDeString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
