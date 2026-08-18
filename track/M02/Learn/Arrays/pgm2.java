
import java.util.Scanner;

class Pgm2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];

        System.err.println("Enter the 5 elements of the array: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }

        System.err.println("The 5 elements of the array are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.err.println(a[i]);
        }

    }
}
