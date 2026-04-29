/**
 * Problem: Remove Duplicates from Array
 *
 * Task:
 * - Print only unique elements from an array
 *
 * Input:
 * - Array with possible duplicate values
 *
 * Output:
 * - Array elements without duplicates (printed once)
 *
 * Approach:
 * - Traverse each element
 * - Compare it with all previous elements
 * - If already found → mark as duplicate
 * - If not found → print it
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 40, 40, 50};

        printUnique(arr);
    }

    // Method to print unique elements
    public static void printUnique(int[] arr) {

        System.out.print("Unique elements: ");

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check previous elements
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}