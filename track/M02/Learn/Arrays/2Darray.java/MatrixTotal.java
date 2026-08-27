
import java.util.Scanner;

public class MatrixTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int row = scanner.nextInt();
        int columns = scanner.nextInt();

        int matrix[][] = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            total = 0;
            for (int j = 0; j < columns; j++) {
                total = total + matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);
        }
    }
}
