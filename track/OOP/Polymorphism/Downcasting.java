
class Parent {

    void display1() {
        System.out.println("inside parent display1");
    }

    void display2() {
        System.out.println("inside parent display2");
    }
}

class Child1 extends Parent {

    @Override
    void display2() {
        System.out.println("inside child1 display2");
    }

    void display3() {
        System.out.println("inside child1 display3");
    }
}

class Child2 extends Parent {

    @Override
    void display2() {
        System.out.println("inside child2 display2");
    }

    void display3() {
        System.out.println("inside child2 display3");
    }
}

public class Downcasting {

    public static void main(String[] args) {
        Parent p = new Child1();
        p.display1();
        p.display2();
        ((Child1) (p)).display3();//downcasting
    }
}
