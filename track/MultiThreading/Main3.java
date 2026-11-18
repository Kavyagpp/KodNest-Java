
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition activity started");
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Addition activity completed");
    }
}

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing number activity started");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing number activity completed");
    }
}

class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing character activity started");

        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing character activity completed");
    }
}

public class Main3 {

    public static void main(String[] args) {

        Addition a = new Addition();
        PrintNum n = new PrintNum();
        PrintChar c = new PrintChar();

        a.start();
        n.start();
        c.start();
    }
}
