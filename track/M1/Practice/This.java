
class A {

    void m(String a, String b) {
        System.out.println("m method");
    }

    void m(A a, A b) {
        System.out.println("a" + a + "b" + b);
    }

}

class This {

    public static void main(String[] args) {
        A a1 = new A();
        a1.m(10, 10);
    }
}
