fun main() {
    val autor1 = Autor("João Silva", "123.456.789-00")
    val autor2 = Autor("Maria Souza", "987.654.321-00")
    val autor3 = Autor("Carlos Pereira", "111.222.333-00")

    val editora1 = Editora("Editora A", "Rua 1", "00.000.000/0001-00")
    val editora2 = Editora("Editora B", "Rua 2", "11.111.111/0001-11")
    val editora3 = Editora("Editora C", "Rua 3", "22.222.222/0001-22")

    val livro1 = Livro("Livro 1", 2021, autor1, editora1)
    val livro2 = Livro("Livro 2", 2020, autor2, editora2)
    val livro3 = Livro("Livro 3", 2019, autor3, editora3)

    livro1.exibirLivro()
    println()
    livro2.exibirLivro()
    println()
    livro3.exibirLivro()
}
