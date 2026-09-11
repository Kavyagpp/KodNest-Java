
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("not a nagram");
            return;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedS1 = new String(arr1);
        String sortedS2 = new String(arr2);

        if (sortedS1.equals(sortedS2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not a anagram");
        }

    }
}
