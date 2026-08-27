
public class Snapshot {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }
        int[] liveView = original;
        // Update through liveView.
        liveView[updateIndex] = updatedValue;
        String status;
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            status = "Valid index";
        } else {
            status = "Invalid index";
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (liveView == original));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
        // Display original, snapshot and the reference comparison.
        // Validate requestedIndex before accessing original.
    }
}
