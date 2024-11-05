class ContaCorrente(var saldo: Double) {

    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de R$$valor realizado. Saldo atual: R$$saldo")
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Saque de R$$valor realizado. Saldo atual: R$$saldo")
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun transferir(valor: Double, contaDestino: ContaCorrente) {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            println("Transferência de R$$valor realizada. Saldo atual: R$$saldo")
        } else {
            println("Saldo insuficiente!")
        }
    }
}
