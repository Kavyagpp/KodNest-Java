
class Parent {

    int a = 10;
}

class Child extends Parent {

    int a = 20;

    void disp2() {

        System.out.println("parent a: " + super.a);
        System.out.println("Childs a: " + a);
    }
}

public class Main1 {

    public static void main(String[] args) {
        Child c = new Child();
        c.disp2();
    }
}
