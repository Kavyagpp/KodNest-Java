
import java.util.Scanner;

class Pgm2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];

        System.err.println("Enter the elements of the array: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.err.println(a[i]);
        }

    }
}
