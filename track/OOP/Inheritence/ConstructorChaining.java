
class Parent {

    public Parent() {
        super();
        System.out.println("inside parent 1 const");
    }

    public Parent(int a) {
        super();
        System.out.println("inside parent 2 const");
    }

    void disp3() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("inside child 1 const");
    }

    Child(int a) {
        super(a);
        System.out.println("inside child 2 const");
    }
}

class ConstructorChaining {

    public static void main(String[] args) {
        // Child c = new Child();
        Child c1 = new Child(10);
    }

}
