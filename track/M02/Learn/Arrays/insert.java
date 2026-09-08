
import java.util.*;

class insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size + 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        int index = sc.nextInt();
        int value = sc.nextInt();
        b[index] = value;

        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
