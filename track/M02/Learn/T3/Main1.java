import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int practiceDays = scanner.nextInt();
        int totalSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int problemSolved = scanner.nextInt();
            totalSolved = totalSolved + problemSolved;
        }
        String status;

        if (totalSolved >= 20) {
            status = "Strong progress";
        } else if (totalSolved >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }
        // Calculate the total and display the progress status
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Status: " + status);

        scanner.close();
    }
}