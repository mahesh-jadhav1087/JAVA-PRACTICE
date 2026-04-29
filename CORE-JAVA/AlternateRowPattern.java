/**
 * Problem: Alternate Row Pattern (Numbers & Alphabets)
 *
 * Output:
 * A
 * 12
 * AAA
 * 1234
 * AAAAA
 *
 * Approach:
 * - Odd rows → print 'A'
 * - Even rows → print numbers from 1 to i
 * - Use triangle pattern (j <= i)
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class AlternateRowPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print(j);   // even row → numbers
                } else {
                    System.out.print("A"); // odd row → letters
                }
            }

            System.out.println();
        }
    }
}