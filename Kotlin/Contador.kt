fun main() {
    print("Informe uma string: ")
    val input = readLine()!!

    val totalLetras = input.count { it.isLetter() }
    val vogais = input.count { it in "aeiouAEIOU" }
    val consoantes = totalLetras - vogais

    println("Total de letras: $totalLetras")
    println("Vogais: $vogais")
    println("Consoantes: $consoantes")
}
