
import java.util.Scanner;

public class IdenticalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        boolean equal = true;
        if (size1 != size2) {
            equal = false;
        } else {

            for (int i = 0; i < size1; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
