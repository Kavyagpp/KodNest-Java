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

public class JoinMethod {

    public static void main(String[] args) {
        System.out.println("Main Thread Execution started");

        Addition t1 = new Addition();
        PrintNum t2 = new PrintNum();
        PrintChar t3 = new PrintChar();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread execution completed");
    }
}