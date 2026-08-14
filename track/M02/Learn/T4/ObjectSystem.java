import java.util.Scanner;

class Learner {
    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;
}

public class ObjectSystem
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner l1 = new Learner();
        l1.id = scanner.nextInt();
        scanner.nextLine();
        l1.name = scanner.nextLine();
        l1.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner l2 = new Learner();
        l2.id = scanner.nextInt();
        scanner.nextLine();
        l2.name = scanner.nextLine();
        l2.javaScore = scanner.nextInt();

        // Read the new score
        int newScore = scanner.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        // Update only the first learner's score
        l1.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        scanner.close();
    }
}