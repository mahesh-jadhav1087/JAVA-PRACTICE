/**
 * Problem: Print ASCII Table (0 to 127)
 *
 * Approach:
 * - Loop from 0 to 127
 * - Typecast each number to character
 * - Print number and corresponding character
 *
 * Time Complexity: O(1) (fixed range)
 * Space Complexity: O(1)
 */

public class AsciiTablePrinter {

    public static void main(String[] args) {

        // Print ASCII values from 0 to 127
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " = " + (char) i);
        }
    }
}