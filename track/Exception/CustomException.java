
import java.util.Scanner;

class UnderAgeException extends Exception {

    public UnderAgeException() {
        super("You are tooo young,,,,,, still u have time");
    }
}

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your AGE: ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else {
            System.out.println("DrivingLicence will be issued");
        }
    }
}

public class CustomException {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();

        try {
            dl.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
