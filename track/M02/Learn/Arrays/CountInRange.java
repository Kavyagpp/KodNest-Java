
import java.util.Scanner;

public class CountInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }
        System.out.println(count);
    }
}
