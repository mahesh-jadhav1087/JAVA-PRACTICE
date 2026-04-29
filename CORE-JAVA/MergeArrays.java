/**
 * Problem: Merge Two Arrays
 *
 * Approach:
 * - Create a new array of size (a.length + b.length)
 * - Copy elements of first array
 * - Copy elements of second array after first
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 9, 9, 10};

        // Merge arrays
        int[] mergedArray = merge(a, b);

        // Display arrays
        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two arrays
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        // Copy elements of first array
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // Copy elements of second array
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}