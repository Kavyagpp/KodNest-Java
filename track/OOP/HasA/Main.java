
class OS {

    OS() {
        System.out.println("OS installed");
    }

    void checkOs() {
        System.out.println("OS is executing");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile object is created with OS");
    }
}

public class Main {

    public static void main(String[] args) {
        Mobile m;
        m = new Mobile();
        m.o.checkOs();
        //m.null;
        //m.o.checkOs();//exception
    }
}
