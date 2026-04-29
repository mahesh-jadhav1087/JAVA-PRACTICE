/**
 * Problem: Character Classification
 *
 * Task:
 * - Check whether a character is:
 *      Alphabet
 *      Digit
 *      Special Character
 *
 * Approach:
 * - Use ASCII ranges:
 *      'A'–'Z' or 'a'–'z' → Alphabet
 *      '0'–'9' → Digit
 *      Otherwise → Special Character
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class CharacterClassifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Classify
        classifyCharacter(ch);

        scanner.close();
    }

    // Method to classify character
    public static void classifyCharacter(char ch) {

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Character");
        }
    }
}