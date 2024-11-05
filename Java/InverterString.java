import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String str = scanner.nextLine();
        String strInvertida = new StringBuilder(str).reverse().toString();
        System.out.println("String invertida: " + strInvertida);

    }
}
