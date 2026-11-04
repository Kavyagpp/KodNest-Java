
import java.util.Scanner;

public class minLabelChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String labels = sc.next();

        System.out.println(minLabelChanges(labels));

        sc.close();
    }

    public static int minLabelChanges(String labels) {

        int left = 0;
        int right = labels.length() - 1;
        int changes = 0;

        while (left < right) {

            if (labels.charAt(left) != labels.charAt(right)) {
                changes++;
            }

            left++;
            right--;
        }

        return changes;
    }
}
