
import java.util.Scanner;

public class ArrayRuntimedata {

    public static void main(String[] args) {
        // Write your code here.
        int readings[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= readings.length - 1; i++) {
            readings[i] = scan.nextInt();
        }
        System.out.print("Total: ");
        int total = 0;
        for (int i = 0; i <= readings.length - 1; i++) {
            total = total + readings[i];
        }
        System.out.println(total);
    }
}
