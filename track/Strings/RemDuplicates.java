
import java.util.*;

public class RemDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
