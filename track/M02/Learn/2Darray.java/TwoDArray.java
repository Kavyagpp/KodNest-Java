
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.print("Enter the value of 2d array: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Element are:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
