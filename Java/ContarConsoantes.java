import java.util.Scanner;

public class ContarConsoantes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para contar as consoantes: ");
        String str = scanner.nextLine().toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        System.out.println("Número de consoantes: " + count);

    }

}
