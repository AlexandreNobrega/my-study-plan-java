package alura;

public class TestaTrataException3 {

/*    public static void metodo1() {
        try {
            new ContaDoBem().saca(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("tratei no metodo 1");
        }
    }*/

    public static void metodo1() throws SaldoInsuficienteException {
        new ContaDoBem().saca(500);
    }

    public static void main(String[] args) {

        try {
            metodo1();
        } catch (NullPointerException e) {
            System.out.println("Tratei a exceção no método main: NullPointerException");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Tratei a exceção no método main: SaldoInsuficienteException");
        }
    }
}
