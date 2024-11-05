import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Informe a base: ")
    val base = readLine()!!.toDouble()
    print("Informe o expoente: ")
    val expoente = readLine()!!.toDouble()

    val resultadoExponenciacao = base.pow(expoente)
    val resultadoRaizQuadrada = sqrt(base)

    println("Resultado da exponenciação: $resultadoExponenciacao")
    println("Resultado da raiz quadrada: $resultadoRaizQuadrada")
}
