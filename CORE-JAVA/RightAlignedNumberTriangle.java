/**
 * Problem: Right-Aligned Number Triangle
 *
 * Output:
 *         1
 *       1 2
 *     1 2 3
 *   1 2 3 4
 * 1 2 3 4 5
 *
 * Approach:
 * - Outer loop → rows
 * - First inner loop → print spaces
 * - Second inner loop → print numbers from 1 to i
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class RightAlignedNumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}