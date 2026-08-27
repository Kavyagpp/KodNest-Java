
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Product1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the product name and price
        String name = scanner.nextLine();
        Double price = scanner.nextDouble();
        // Create one Product object
        Product p = new Product(name, price);

        // Call display()
        p.display();
    }
}
