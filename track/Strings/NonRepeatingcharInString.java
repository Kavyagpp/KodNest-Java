
import java.util.Scanner;

public class NonRepeatingcharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int j;
            for (j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    break;
                }
            }
            if (j == s.length()) {
                System.out.println(s.charAt(i));
            }
        }
    }
}
