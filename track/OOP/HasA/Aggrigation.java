
class OS {

    OS() {
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS still executing");
    }
}

class Charger {

    Charger() {
        System.out.println("charger is created");
    }

    void getCharger() {
        System.out.println("Charger is used for charging ");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile is created with OS");
    }

    void hasA(Charger c) {
        System.out.println("charger acquired");
    }
}

class Aggrigation {

    public static void main(String[] args) {
        Charger c = new Charger();
        Mobile m = new Mobile();
        m.hasA(c);
        c.getCharger();
        m = null;
        m.o.checkOS();// exception
        c.getCharger();
    }
}
