
import java.util.*;

public class removeElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size - 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int index = sc.nextInt();

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        for (int i = index; i < b.length; i++) {
            b[i] = a[i + 1];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
