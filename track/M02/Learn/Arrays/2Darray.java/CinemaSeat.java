
import java.util.Scanner;

public class CinemaSeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[row][columns];
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println("Available seats: " + count);
    }
}
