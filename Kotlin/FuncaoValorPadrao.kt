fun fornecerString(input: String?): String {
    return input ?: "Valor padrão"
}

fun main() {
    print("Informe uma string (ou deixe vazio): ")
    val input: String? = readLine()

    val resultado = fornecerString(input)
    println("String resultante: $resultado")
}
