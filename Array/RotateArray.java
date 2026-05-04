/**
 * Problem: Rotate Array (Left Rotation)
 *
 * Approach:
 * - Shift elements left one by one
 * - Repeat k times
 *
 * 
 */

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateLeft(arr, k);

        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] arr, int k) {

        int n = arr.length;

        for (int r = 0; r < k; r++) {

            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }
    }
}