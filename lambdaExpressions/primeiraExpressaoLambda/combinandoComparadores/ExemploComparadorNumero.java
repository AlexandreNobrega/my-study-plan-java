package lambdaExpressions.primeiraExpressaoLambda.combinandoComparadores;

import java.util.Comparator;

public class ExemploComparadorNumero {

    public static void main(String[] args) {

        Comparator<Integer> comparator = (i1, i2) -> Integer.compare(i1, i2);

        int result = comparator.compare(20, 10);

        System.out.println(result);

        //Exemplo com método vinculado
        Comparator<Integer> comparatorVinculado = Integer::compare;

        int resultVinculado =  comparatorVinculado.compare(20, 10);

        System.out.println(resultVinculado);

    }
}
