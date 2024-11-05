fun main() {
    print("Informe uma string: ")
    val input: String? = readLine()

    println("Comprimento da string: ${input?.length ?: "String nula"}")
}
