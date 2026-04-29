/**
 * Problem: Merge Two Arrays (User Input)
 *
 * Approach:
 * - Take two arrays as input
 * - Create a third array of size (n1 + n2)
 * - Copy elements of first array
 * - Then copy elements of second array
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

import java.util.*;

public class MergeTwoArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input sizes
        System.out.print("Enter first array size: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second array size: ");
        int n2 = scanner.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Input first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merge arrays
        int[] merged = merge(arr1, arr2);

        // Output
        System.out.println("Merged array:");
        System.out.println(Arrays.toString(merged));

        scanner.close();
    }

    // Method to merge arrays
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }
}