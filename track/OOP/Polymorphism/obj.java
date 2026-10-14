
import java.util.*;

class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class obj {

    public static void main(String[] args) {
        Student s1 = new Student(11, "yash");
        Student s2 = new Student(12, "kavya");
        Student s3 = new Student(11, "yash");

        Object s4 = new Student(22, "Ravi"); // upcasting

        System.out.println(s1.getClass());
        System.out.println(s4.getClass());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // System.out.println(s4.toString());
        // System.out.println(s4.hashCode());

    }
}
