
class Hospital implements Runnable {

    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("TOM")) {
            tomTreatement();
        } else {
            jerryTreatement();
        }
    }

    void tomTreatement() {
        try {
            synchronized (res1) { //Bed
                System.out.println("Tom has occupied" + res1);
                Thread.sleep(3000);
                synchronized (res2) { //Doctor
                    System.out.println("Tom has occupied" + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom has relesed" + res2);
            }
            System.out.println("Tom has relesed" + res1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jerryTreatement() {
        try {
            synchronized (res1) { //Bed
                System.out.println("jerry has occupied" + res1);
                Thread.sleep(3000);
                synchronized (res2) { //Doctor
                    System.out.println("jerry has occupied" + res2);
                    Thread.sleep(3000);
                }
                System.out.println("jerry has relesed" + res2);
            }
            System.out.println("jerry has relesed" + res1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SyncBlock {

    public static void main(String[] args) {
        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("TOM");
        t2.setName("JERRY");
        t1.start();
        t2.start();
    }
}
