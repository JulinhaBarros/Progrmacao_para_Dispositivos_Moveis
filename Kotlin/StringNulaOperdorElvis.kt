fun main() {
    print("Informe uma string (ou deixe vazio): ")
    val input: String? = readLine()

    val resultado = input ?: "Valor padrão"
    println("Resultado: $resultado")
}
