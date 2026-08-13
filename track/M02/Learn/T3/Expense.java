import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();
        double totalExpense = 0;

        totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        String status;

        if (remainingAmount >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);
        System.out.println("Status: " + status);

        // Read income and expenses
        // Calculate and display the budget details

        scanner.close();
    }
}