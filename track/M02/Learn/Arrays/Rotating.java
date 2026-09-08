
import java.util.*;

public class Rotating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
