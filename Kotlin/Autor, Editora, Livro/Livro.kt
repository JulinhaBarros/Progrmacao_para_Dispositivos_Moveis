class Livro(val nome: String, val anoPublicacao: Int, val autor: Autor, val editora: Editora) {
    fun exibirLivro() {
        println("Livro: $nome, Ano: $anoPublicacao")
        autor.exibirAutor()
        editora.exibirEditora()
    }
}
