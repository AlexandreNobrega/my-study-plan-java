package alura;

public class ContaDoBem {

    double saldo = 100;

    void saca(double quantidade) throws SaldoInsuficienteException {
        if (this.saldo < quantidade) {
            System.out.println("Propaga o tratamento de exceção para o método 1");
            throw new SaldoInsuficienteException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
        }
        saldo -= quantidade;
    }
}
