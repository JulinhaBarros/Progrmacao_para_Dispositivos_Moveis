import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inicial: ");
        int limiteInicial = scanner.nextInt();

        System.out.print("Digite o limite final: ");
        int limiteFinal = scanner.nextInt();

        System.out.println("Números pares entre " + limiteInicial + " e " + limiteFinal + ":");
        for (int i = limiteInicial; i <= limiteFinal; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

