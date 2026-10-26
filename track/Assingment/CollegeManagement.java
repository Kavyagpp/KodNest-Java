
import java.util.Scanner;

abstract class Person {

    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    abstract double calculatePayment();

    abstract void displayRole();

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    double courseFee;
    String courseName;

    Student(int id, String name, int age, String courseName, double courseFee) {
        super(id, name, age);
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    @Override
    double calculatePayment() {
        return courseFee;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Course: " + courseName);
    }
}

class Professor extends Person {

    String subject;
    double salary;

    Professor(int id, String name, int age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Professor");
        System.out.println("Subject: " + subject);
    }
}

class AdminStaff extends Person {

    String department;
    double salary;

    AdminStaff(int id, String name, int age, String department, double salary) {
        super(id, name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Admin Staff");
        System.out.println("Department: " + department);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        // Read two students
        for (int i = 0; i < 2; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String course = sc.next();
            double fee = sc.nextDouble();

            people[i] = new Student(id, name, age, course, fee);
        }

        // Read two professors
        for (int i = 2; i < 4; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String subject = sc.next();
            double salary = sc.nextDouble();

            people[i] = new Professor(id, name, age, subject, salary);
        }

        // Read one admin staff member
        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        String department = sc.next();
        double salary = sc.nextDouble();

        people[4] = new AdminStaff(id, name, age, department, salary);

        double totalPayment = 0;

        // Display details and calculate total
        for (Person p : people) {
            p.showDetails();
            p.displayRole();

            double payment = p.calculatePayment();

            System.out.println("Payment: " + payment);
            System.out.println();

            totalPayment += payment;
        }

        System.out.println("Total Payment: " + totalPayment);

        sc.close();
    }
}
