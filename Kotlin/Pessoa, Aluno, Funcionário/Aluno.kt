class Aluno(nome: String, idade: Int, val matricula: String, val curso: String) : Pessoa(nome, idade) {
    fun exibirAluno() {
        exibirInformacoes()
        println("Matrícula: $matricula, Curso: $curso")
    }
}
