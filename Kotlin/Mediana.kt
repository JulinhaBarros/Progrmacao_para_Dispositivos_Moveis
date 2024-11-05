fun main() {
    print("Informe os números separados por espaço: ")
    val numeros = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val mediana = if (numeros.size % 2 == 0) {
        val meio = numeros.size / 2
        (numeros[meio - 1] + numeros[meio]) / 2.0
    } else {
        numeros[numeros.size / 2].toDouble()
    }

    println("A mediana é: $mediana")
}
