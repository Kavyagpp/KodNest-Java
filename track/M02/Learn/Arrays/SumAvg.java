
import java.util.Scanner;

public class SumAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
        double average = (double) sum / size;
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
