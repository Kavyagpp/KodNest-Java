
abstract class Parent {

    abstract void disp1();

    abstract void disp2();
}

class Child1 extends Parent {

    @Override
    void disp1() {
        System.out.println("inside Child1 disp1");
    }

    @Override
    void disp2() {
        System.out.println("inside Child1 disp2");
    }
}

class Child2 extends Parent {

    @Override
    void disp1() {
        System.out.println("inside Child2 disp1");
    }

    @Override
    void disp2() {
        System.out.println("inside Child2 disp2");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        accessMethod(ch1);
        accessMethod(ch2);
    }

    static void accessMethod(Parent p) { // p is reference variable of type Parent class
        p.disp1();
        p.disp2();
    }
}
