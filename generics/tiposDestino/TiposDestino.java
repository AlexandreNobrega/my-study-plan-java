package generics.tiposDestino;

import java.util.Collections;
import java.util.List;

public class TiposDestino {


    //TODO: Como o método emptyList retorna um valor de tipo List<T>,
    // o compilador deduz que o argumento de tipo <T> deve ser o valor String.
    List<String> listOne = Collections.emptyList();


}
