
class Parent {

    Parent() {
        System.out.println("inside parent 0 const");
    }
}

class Child {

    Child() {
        this(10);
        System.out.println("inside child 0 const");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("inside child 1 const");
    }

    Child(int a, int b) {
        System.out.println("inside child 2 const");
    }
}

public class LocalChaining {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
