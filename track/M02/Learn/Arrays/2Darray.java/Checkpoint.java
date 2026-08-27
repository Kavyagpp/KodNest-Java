
import java.util.Scanner;

public class Checkpoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int aTotal = 0;
        for (int i = 0; i < size; i++) {
            aTotal = aTotal + arr[i];
        }
        System.out.println("Array total: " + aTotal);

        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int mTotal = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mTotal = mTotal + matrix[i][j];
            }
        }
        System.out.println("Matrix total: " + mTotal);
    }
}
