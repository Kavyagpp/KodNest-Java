
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
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

public class StudentApplication {

    public static void main(String[] args) {
        Student s = new Student();
        s.input("Kavya", 23, 5.0);
        s.display();
    }
}
