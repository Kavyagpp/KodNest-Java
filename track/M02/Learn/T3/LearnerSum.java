
import java.util.Scanner;

public class LearnerSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        String name = scanner.nextLine();
        int practiceDay = scanner.nextInt();
        int totalSolved = 0;

        // Calculate and display the progress summary
        for (int day = 1; day <= practiceDay; day++) {
            int solvedProblem = scanner.nextInt();
            totalSolved = totalSolved + solvedProblem;
        }

        String status;
        double dailyAverage = (double) totalSolved / practiceDay;

        if (dailyAverage >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
