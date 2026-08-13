
import java.util.Scanner;

class StudentUtility {

    // Create the four required methods
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(double javaScore, double sqlScore) {
        return ((javaScore + sqlScore) / 200.0) * 100;
    }
}

public class StudentUtilit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input, call methods and display the result
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        double javaScore = scanner.nextDouble();
        double sqlScore = scanner.nextDouble();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double passingPercentage = utility.getPassingPercentage();
        double percentage = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + percentage);

        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else if (percentage >= 40) {
            System.out.println("Result: NEEDS IMPROVEMENT");
        } else {
            System.out.println("Result: FAIL");
        }

        scanner.close();
    }
}
