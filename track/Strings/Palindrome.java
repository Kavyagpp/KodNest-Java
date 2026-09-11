
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        // Create the reversed word and compare it.
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];

        int j = revArr.length - 1;

        for (int i = 0; i <= charArr.length - 1; i++) {
            revArr[j] = charArr[i];
            j--;
        }

        String revStr = new String(revArr);

        if (str.equals(revStr)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
}
