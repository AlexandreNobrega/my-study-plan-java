package generics.diretrizesCuringas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;

        // TODO: Não é possível armazenar um novo elemento ou
        //  alterar um elemento existente na lista "ln"
        //  devido a lista "ln" receber apenas valores do tipo da lista "le"
        //  A lista "ln" é apenas para leitura da dados.
        ln.add(new NaturalNumber(35));

    }
}
