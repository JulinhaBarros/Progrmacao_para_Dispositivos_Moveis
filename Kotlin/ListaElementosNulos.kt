fun main() {
    val lista: List<String?> = listOf("Kotlin", null, "Java", null, "Python")

    lista.forEach {
        it?.let { println(it) }
    }
}
