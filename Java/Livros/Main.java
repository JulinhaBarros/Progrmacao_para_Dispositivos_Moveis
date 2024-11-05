public class Main {
    public static void main(String[] args) {
        // Criar autores
        Autor autor1 = new Autor("Autor A", "123.456.789-00");
        Autor autor2 = new Autor("Autor B", "987.654.321-00");
        Autor autor3 = new Autor("Autor C", "111.222.333-44");

        // Criar editoras
        Editora editora1 = new Editora("Editora X", "Rua A, 123", "12.345.678/0001-99");
        Editora editora2 = new Editora("Editora Y", "Avenida B, 456", "98.765.432/0001-11");
        Editora editora3 = new Editora("Editora Z", "Praça C, 789", "11.223.344/0001-22");

        // Criar livros
        Livro livro1 = new Livro("Livro 1", 2020, autor1, editora1);
        Livro livro2 = new Livro("Livro 2", 2021, autor2, editora2);
        Livro livro3 = new Livro("Livro 3", 2022, autor3, editora3);

        // Exibir informações
        System.out.println("Autores:");
        System.out.println(autor1.getNome() + " - ");
    }
}
