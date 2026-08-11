
import java.util.Scanner;

public class charat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        char ch = sc.next().charAt(2);
        System.out.println(ch);
    }
}
