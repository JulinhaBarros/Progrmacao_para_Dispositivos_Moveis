import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para contar as vogais: ");
        String str = scanner.nextLine().toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Número de vogais: " + count);

    }
}
