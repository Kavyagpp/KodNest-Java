
import java.util.Scanner;

public class ValidateRoute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String route = sc.next();
        String priority = sc.next();
        int k = sc.nextInt();

        System.out.println(validRoute(route, priority, k) ? "VALID" : "INVALID");

        sc.close();
    }

    public static boolean validRoute(String route, String priority, int k) {

        int prev = -1;

        for (int i = 0; i < priority.length(); i++) {

            char ch = priority.charAt(i);

            int curr = route.indexOf(ch);

            // Priority character not found
            if (curr == -1) {
                return false;
            }

            // Check whether priority order is maintained
            if (curr <= prev) {
                return false;
            }

            // Check number of ordinary locations between stops
            if (prev != -1 && curr - prev - 1 > k) {
                return false;
            }

            prev = curr;
        }

        return true;
    }
}
