fun main() {
    print("Informe um número: ")
    val numero = readLine()!!.toInt()

    when {
        numero > 0 -> println("O número é positivo")
        numero < 0 -> println("O número é negativo")
        else -> println("O número é zero")
    }
}
