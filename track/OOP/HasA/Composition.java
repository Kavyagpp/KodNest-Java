
class Heart {

    void heartBeat() {
        System.out.println("Heart is beating");
    }
}

class Person {

    Heart h = new Heart();

    Person() {
        System.out.println("Person object is created with heart");
    }
}

class Composition {

    public static void main(String[] args) {
        Person p = new Person();
        p.h.heartBeat();
    }
}
