
import java.util.Scanner;

class NearestToBoundary {

    private static boolean maxCount;
    private static String minCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            long maxDistance = Math.abs(arr[i] - max);
            long minDistance = Math.abs(arr[i] - min);

            int minCount = 0;
            int maxCount = 0;

            if (minDistance < maxDistance) {
                minCount++;
            } else if (maxDistance < minDistance) {
                maxCount++;
            } else if (maxDistance == minDistance) {
                maxCount++;
                minCount++;
            }
        }
        System.out.println(minCount + " " + maxCount);

    }
}
