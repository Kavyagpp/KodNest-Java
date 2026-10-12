
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
        if (this.roll == s.roll && this.name == s.name) {
            return true;
        } else {
            return false;
        }
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

class Overridenm {

    public static void main(String[] args) {
        Student s1 = new Student(11, "yash");
        Student s2 = new Student(12, "kavya");
        Student s3 = new Student(11, "yash");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
