package lambdaExpressions.primeiraExpressaoLambda.alura.exercicios;

public class RunnableLambda {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

        //Com Lambda
        Runnable runnable = () -> System.out.println("Executando um Runnable com Java");

        runnable.run();

    }
}
