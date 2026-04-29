/**
 * Problem: Find Missing Elements in Range 1 to N
 *
 * Given:
 * - An array containing some numbers from 1 to N
 * - Find all missing numbers in that range
 *
 * Example:
 * Input: arr = [1,2,3,4,5], n = 7
 * Output: 6 7
 *
 * Approach 1 (Brute Force):
 * - For each number from 1 to N, check if it exists in array
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

public class MissingElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = 7;

        System.out.print("Missing elements: ");
        findMissing(arr, n);
    }

    // Brute force approach
    public static void findMissing(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {

            boolean found = false;

            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}