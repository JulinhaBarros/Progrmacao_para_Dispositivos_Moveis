fun main() {
    val pessoa = Pessoa("Carlos", 30)
    pessoa.exibirInformacoes()

    val aluno = Aluno("Ana", 20, "12345", "Engenharia")
    aluno.exibirAluno()

    val funcionario = Funcionario("João", 40, 5000.0, "Gerente")
    funcionario.exibirFuncionario()
}
