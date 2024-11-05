import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int[] array = new int[5];

            System.out.println("Digite 5 números inteiros:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            System.out.println("Array ordenado:");
            for (int num : array) {
                System.out.println(num);
            }
    }
}
