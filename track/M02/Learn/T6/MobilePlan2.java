
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        this.planName = planName;
        this.price = price;

    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();
        // Create the default plan
        MobilePlan m = new MobilePlan("Basic", 199);
        MobilePlan m1 = new MobilePlan(planName, price);
        m.display();
        m1.display();
        // Create the selected plan
        // Display both plans
    }
}
