
class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
    }
}

public class Constructors {

    public static void main(String[] args) {
        Student s = new Student("Kavya", 23, 5.0);
        s.display();
    }
}
