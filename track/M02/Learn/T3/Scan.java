
import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value:");
        byte a = sc.nextByte();
        System.out.println(a);

        System.out.println("Enter short Value:");
        short b = sc.nextShort();
        System.out.println(b);

        System.out.println("Enter integer value:");
        int c = sc.nextInt();
        System.out.println(c);

        System.out.println("Enter Long value:");
        long d = sc.nextLong();
        System.out.println(d);

        System.out.println("Enter Float value:");
        float e = sc.nextFloat();
        System.out.println(e);

        System.out.println("Enter Double value:");
        double f = sc.nextDouble();
        System.out.println(f);

        System.out.println("Enter boolean value:");
        boolean g = sc.nextBoolean();
        System.out.println(g);
    }
}
