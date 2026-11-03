
import java.util.*;

public class missingCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] scanned = new int[m];
        for (int i = 0; i < m; i++) {
            scanned[i] = sc.nextInt();
        }
        System.out.println(missCount(expected, scanned));
        sc.close();
    }

    public static int missCount(int[] expected, int[] scanned) {
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            boolean found = false;
            for (int j = 0; j < scanned.length; j++) {
                if (expected[i] == scanned[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }
}
