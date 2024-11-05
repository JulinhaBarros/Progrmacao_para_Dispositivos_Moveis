fun main() {
    print("Informe o valor inicial: ")
    val inicio = readLine()!!.toInt()
    print("Informe o valor final: ")
    val fim = readLine()!!.toInt()

    var produto = 1
    for (i in inicio..fim) {
        produto *= i
    }
    println("O produto dos números é: $produto")
}
