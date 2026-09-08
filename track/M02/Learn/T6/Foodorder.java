
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item = "Sandwich";
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Foodorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        FoodOrder f = new FoodOrder(item, 1);
        f.display();
        FoodOrder f1 = new FoodOrder(item, quantity);
        f1.display();
        // Create one order with the first constructor
        // Create one order with the second constructor
        // Display both orders
    }
}
