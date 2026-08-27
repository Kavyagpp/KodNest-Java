
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int found = -1;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        System.out.println(found);
        scanner.close();
    }
}
