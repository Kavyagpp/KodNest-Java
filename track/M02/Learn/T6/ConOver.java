
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "kavyagp";
        age = 0;
        height = 0;
    }

    Student(String name) {
        this.name = name;
    }

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

public class ConOver {

    public static void main(String[] args) {
        Student s1 = new Student("Kavya");
        s1.display();
        Student s2 = new Student("Kavya", 23, 5.6);
        s2.display();
        Student s3 = new Student();
        s3.display();

    }
}
