
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey steals and eats");
    }
}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger hunts and eats");
    }
}

class AnimalApp {

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sleep();
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
    }
}
