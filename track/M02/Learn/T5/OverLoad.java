
import java.util.Scanner;

class Printer {

    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }
}

public class OverLoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();

        // Create one Printer object
        Printer p = new Printer();

        // Call both show() methods
        p.show(number);
        p.show(word);
    }
}
