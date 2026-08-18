
import java.util.Scanner;

class MaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array element are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is: " + max);
    }
}
