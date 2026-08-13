
import java.util.Scanner;

class Student {

    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentReg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();
        s1.registrationId = scanner.nextInt();
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.registrationId = scanner.nextInt();
        scanner.nextLine();
        s2.name = scanner.nextLine();
        s2.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        Student selectedStudent = null;
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Make selectedStudent refer to the matching existing object
        if (s1.registrationId == selectedId) {
            selectedStudent = s1;
        } else if (s2.registrationId == selectedId) {
            selectedStudent = s2;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");

        scanner.close();
    }
}
