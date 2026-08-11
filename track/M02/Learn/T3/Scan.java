
import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value:");
        byte a = sc.nextByte();// it will read only byte value
        System.out.println(a);

        System.out.println("Enter short Value:");
        short b = sc.nextShort();// it will read only short value
        System.out.println(b);

        System.out.println("Enter integer value:");
        int c = sc.nextInt();//it will read only int value
        System.out.println(c);

        System.out.println("Enter Long value:");
        long d = sc.nextLong();//it will read only long value
        System.out.println(d);

        System.out.println("Enter Float value:");
        float e = sc.nextFloat();//it will read only float value
        System.out.println(e);

        System.out.println("Enter Double value:");
        double f = sc.nextDouble();//it will read only double value
        System.out.println(f);

        System.out.println("Enter boolean value:");
        boolean g = sc.nextBoolean();//it will read only boolean value
        System.out.println(g);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("age=" + age);

        System.out.println("Enter your height:");
        int height = sc.nextInt();
        System.out.println("height=" + height);

        sc.nextLine();

        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("name=" + name);

        System.out.println("Enter your full name:");
        String fullname = sc.nextLine();
        System.out.println("fullname=" + fullname);
    }
}
//next() is used to read only one word.It will stop when it find whitespace.
//nextLine() is used to read full line including whitespace.
