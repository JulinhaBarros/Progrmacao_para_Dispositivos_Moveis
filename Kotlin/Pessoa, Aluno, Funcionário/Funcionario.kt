class Funcionario(nome: String, idade: Int, val salario: Double, val cargo: String) : Pessoa(nome, idade) {
    fun exibirFuncionario() {
        exibirInformacoes()
        println("Salário: $salario, Cargo: $cargo")
    }
}
