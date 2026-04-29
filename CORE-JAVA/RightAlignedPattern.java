/**
 * Problem: Right-Aligned Star/Hash Pattern
 *
 * Output:
 *         *
 *       # #
 *     * * *
 *   # # # #
 *   * * * *
 *
 * Approach:
 * - Outer loop → rows
 * - Inner loop → columns
 * - Print spaces before pattern starts
 * - Use condition:
 *      Even row → print '#'
 *      Odd row  → print '*'
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class RightAlignedPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j >= n + 1 - i) {

                    // Even row → '#', Odd row → '*'
                    if (i % 2 == 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }

                } else {
                    System.out.print("  "); // spacing
                }
            }
            System.out.println();
        }
    }
}