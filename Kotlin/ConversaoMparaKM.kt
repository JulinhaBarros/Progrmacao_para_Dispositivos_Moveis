fun main() {
    print("Informe o valor em metros: ")
    val metros = readLine()!!.toDouble()

    val quilometros = metros / 1000
    println("$metros metros equivalem a $quilometros quilômetros")

    println("$quilometros quilômetros equivalem a ${quilometros * 1000} metros")
}
