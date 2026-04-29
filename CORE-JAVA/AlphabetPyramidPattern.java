/**
 * Problem: Alphabet Pyramid Pattern
 *
 * Output:
 *         A
 *       A B A
 *     A B C B A
 *   A B C D C B A
 * A B C D E D C B A
 *
 * Approach:
 * - Use two loops:
 *      Outer loop → rows
 *      Inner loop → columns
 * - Print characters in increasing order till middle
 * - Then decrease characters
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class AlphabetPyramidPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            char ch = 'A';

            for (int j = 1; j <= 2 * n - 1; j++) {

                if (j >= n + 1 - i && j <= n - 1 + i) {

                    System.out.print(ch + " ");

                    // Increase till middle, then decrease
                    if (j < n) {
                        ch++;
                    } else {
                        ch--;
                    }
                } else {
                    System.out.print("  "); // spacing
                }
            }
            System.out.println();
        }
    }
}