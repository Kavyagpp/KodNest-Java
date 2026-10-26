
abstract class Employee {

    int id;
    String name;
    int salary;

    static String companyName = "KodNost";
    static int employeeCount = 0;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    static void showRole() {
        System.out.println("Employee Role");
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }

}

class Developer extends Employee {

    int bonus = 5000;

    Developer(int id, String name, int salary) {
        super(id, name, salary);
    }

    static void showRole() {
        System.out.println("Developer Role");
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Salary: " + calculateSalary());
    }

}

class Trainer extends Employee {

    int allowance = 3000;

    Trainer(int id, String name, int salary) {
        super(id, name, salary);
    }

    static void showRole() {
        System.out.println("Trainer Role");
    }

    @Override
    double calculateSalary() {
        return salary + allowance;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Trainer");
        System.out.println("Salary: " + calculateSalary());
    }

}

public class EmployeePayrollManagement {

    public static void main(String[] args) {
        Developer d = new Developer(101, "Rahul", 40000);
        Trainer t = new Trainer(102, "Priya", 35000);

        System.out.println("Company: " + Employee.companyName);

        System.out.println();

        d.displayDetails();
        System.out.println();

        t.displayDetails();

        System.out.println("Total Employees: " + Employee.employeeCount);

        System.out.println();
        Employee.showRole();
        Developer.showRole();
        Trainer.showRole();
    }

}
