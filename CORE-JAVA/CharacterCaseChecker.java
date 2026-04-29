/**
 * Problem: Check Character Case (Uppercase / Lowercase)
 *
 * Approach:
 * - Take a character as input
 * - Check ASCII range:
 *      'A' to 'Z' → Uppercase
 *      'a' to 'z' → Lowercase
 * - Otherwise, it's not an alphabet
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class CharacterCaseChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check character type
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Character is Uppercase");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Character is Lowercase");
        } 
        else {
            System.out.println("Not an alphabet character");
        }

        scanner.close();
    }
}