
class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by passenger");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}

class Ticket {

}

class Money {

}

class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        c.collect(m);
        Ticket t = c.give();
        System.err.println(t);
        if (t != null) {
            System.out.println("Ticket collected");
        }
    }
}
