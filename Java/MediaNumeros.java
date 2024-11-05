import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            soma += scanner.nextDouble();
        }

        double media = soma / 10;
        System.out.println("A média é: " + media);
    }
}
