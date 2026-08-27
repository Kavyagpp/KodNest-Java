
import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {

            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.print(positiveCount + " ");
        System.out.print(negativeCount + " ");
        System.out.print(zeroCount);
        scanner.close();
    }
}
