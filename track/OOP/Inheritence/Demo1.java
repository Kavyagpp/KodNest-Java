
class pgm {

    int a = 10;

    void display() {
        System.out.println("parent:" + a);
    }
}

class pgm1 extends pgm {

}

public class Demo1 {

    public static void main(String[] args) {
        pgm1 ob = new pgm1();
        ob.display();
    }
}
