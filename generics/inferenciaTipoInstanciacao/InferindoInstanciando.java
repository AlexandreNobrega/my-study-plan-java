package generics.inferenciaTipoInstanciacao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InferindoInstanciando {

    //TODO: Exemplo Inferência e instanciação classe genérica com tipos
    Map<String, List<String>> myMap = new HashMap<String, List<String>>();

    //TODO: Exemplo Inferência e instanciação classe genérica sem tipos
    Map<String, List<String>> myMap2 = new HashMap<>();

    //TODO: A instanciação de HashMap está se referindo ao tipo bruto e não há Map<String, List<String>>
    Map<String, List<String>> myMap3 = new HashMap();




}
