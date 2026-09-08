
import java.util.Scanner;

public class Target {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int frequency = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                frequency++;
            }
        }
        System.out.println("Frequency of " + target + ": " + frequency);
    }
}
