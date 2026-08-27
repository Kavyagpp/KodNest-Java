
import java.util.Scanner;

public class MonthlySales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = sc.nextInt();
        int months = sc.nextInt();

        int sales[][] = new int[product][months];

        for (int i = 0; i < product; i++) {
            for (int j = 0; j < months; j++) {
                sales[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < product; i++) {
            int total = 0;
            for (int j = 0; j < months; j++) {
                total = total + sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
