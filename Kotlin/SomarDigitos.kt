fun main() {
    print("Informe um número: ")
    val numero = readLine()!!.toInt()

    val soma = numero.toString().map { it.toString().toInt() }.sum()
    println("A soma dos dígitos é: $soma")
}
