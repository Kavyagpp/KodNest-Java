
import java.util.Scanner;

class Addition implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition activity started");
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Addition: " + res);
        System.out.println("Addition activity completed");
    }
}

class PrintNum implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("printing num activity started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("printing num activity completed");
    }

}

class PrintChar implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("printing char activity started");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("printing num activity completed");
    }
}

class RunnableThread {

    public static void main(String[] args) {
        Addition a = new Addition();
        PrintNum n = new PrintNum();
        PrintChar c = new PrintChar();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(n);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
    }
}
