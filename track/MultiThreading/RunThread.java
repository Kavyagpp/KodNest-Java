
import java.util.Scanner;

class Activity implements Runnable {

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }

    void addition() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Addition activity started...");

        System.out.println("Enter a:");
        int a = scan.nextInt();

        System.out.println("Enter b:");
        int b = scan.nextInt();

        int res = a + b;

        System.out.println("Addition result is: " + res);

        System.out.println("Addition activity completed...");
    }

    void printChar() {

        System.out.println("Printing char activity started...");

        for (char i = 'A'; i <= 'G'; i++) {

            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing char activity completed...");
    }

    void printNum() {

        System.out.println("Printing num activity started...");

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing num activity completed...");
    }
}

public class RunThread {

    public static void main(String[] args) {

        Activity ac = new Activity();

        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(ac);
        Thread t3 = new Thread(ac);

        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();
    }
}
