import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int termos = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Sequência de Fibonacci:");

        for (int i = 0; i < termos; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}

