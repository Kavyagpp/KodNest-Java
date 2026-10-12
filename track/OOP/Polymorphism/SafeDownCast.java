

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

public class SafeDownCast {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        accessMethod(c1);
        Child2 c2 = new Child2();
        accessMethod(c2);

    }

    public static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();

        if (ref instanceof Child1) {
            ((Child1) (ref)).display3();
        } else if (ref instanceof Child2) {
            ((Child2) (ref)).display3();
        }
    }
}
