
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class TotalOver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator r = new ResultCalculator();

        // Call both overloaded methods and print both totals
        int twoMark = r.getTotal(first, second);
        int threeMark = r.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + twoMark);
        System.out.println("Three-Mark Total: " + threeMark);
    }
}
