
import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int n = size;
        int a[] = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                //evenCount = scanner.nextInt();
                evenCount++;
            } else {
                //oddCount = scanner.nextInt();
                oddCount++;
            }
        }
        System.out.print(evenCount + " ");
        System.out.print(oddCount);

        scanner.close();
    }
}
