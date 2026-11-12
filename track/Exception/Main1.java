
import java.util.Scanner;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int divisor = sc.nextInt();
        int[] values = {12, 24, 36};


        try {
            int result = values[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }


        System.out.println("Finished");
    }
}

