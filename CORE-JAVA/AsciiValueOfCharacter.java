/**
 * Problem: Find ASCII Value of a Character
 *
 * Approach:
 * - Take a character as input
 * - Typecast character to int to get ASCII value
 *
 * Example:
 * Input: 'A'
 * Output: 65
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class AsciiValueOfCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert character to ASCII
        int asciiValue = (int) ch;

        // Output
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);

        scanner.close();
    }
}