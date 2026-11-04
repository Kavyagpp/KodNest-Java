
import java.util.Scanner;

class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Connection established");
        try {
            System.out.println("Enter a:");
            int a = sc.nextInt();

            System.out.println("Enter b:");
            int b = sc.nextInt();

            int res = a / b;

            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero");
            //System.out.println(e.getMessage());
        }
        System.out.println("Connection terminated");
    }
}
