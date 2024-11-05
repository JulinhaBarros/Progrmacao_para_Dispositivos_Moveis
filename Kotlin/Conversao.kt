    fun main() {
        print("Informe o valor em dólares: ")
        val dolares = readLine()!!.toDouble()
        val taxaConversao = 5.20 // Supondo uma taxa de conversão
        val reais = dolares * taxaConversao
        println("O valor em reais é: R$%.2f".format(reais))
    }

