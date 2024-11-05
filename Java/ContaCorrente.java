public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferencia(ContaCorrente contaDestino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.deposito(valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

