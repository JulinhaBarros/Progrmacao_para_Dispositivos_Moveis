public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Aluno aluno = new Aluno("Maria", 20, "123456", "Engenharia");
        Funcionario funcionario = new Funcionario("Carlos", 40, 5000.0, "Gerente");

        System.out.println("Informações da Pessoa:");
        pessoa.exibirInformacoes();

        System.out.println("\nInformações do Aluno:");
        aluno.exibirInformacoes();

        System.out.println("\nInformações do Funcionário:");
        funcionario.exibirInformacoes();
    }
}

