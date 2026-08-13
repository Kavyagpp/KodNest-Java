
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class FourMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one object
        MethodDemo m = new MethodDemo();

        // Call all four methods
        m.sayHello();
        m.greet(name);

        int luckyNumber = m.getLuckyNumber();
        System.out.println("Lucky Number = " + luckyNumber);

        int sum = m.add(first, second);
        System.out.println("Sum = " + sum);
    }
}
