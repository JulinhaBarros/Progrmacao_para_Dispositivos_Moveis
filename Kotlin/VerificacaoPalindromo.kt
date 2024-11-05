fun main() {
    print("Informe um número: ")
    val numero = readLine()!!

    if (numero == numero.reversed()) {
        println("O número é palíndromo")
    } else {
        println("O número não é palíndromo")
    }
}
