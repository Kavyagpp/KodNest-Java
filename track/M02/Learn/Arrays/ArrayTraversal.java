
public class ArrayTraversal {

    public static void main(String[] args) {
        // Write your code here.
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] += bonus;
        }
        System.out.print("Updated values: ");
        for (int i = 0; i <= values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }

    }
}
