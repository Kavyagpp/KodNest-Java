
class Printer implements Runnable {

    @Override
    synchronized public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " started using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " still using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " stopped using printer");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Synchronization {

    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("Java");
        t2.setName("python");
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();

    }
}
