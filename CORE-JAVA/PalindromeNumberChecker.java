/**
 * Problem: Check Palindrome Number
 *
 * Definition:
 * A number is a palindrome if it reads the same forward and backward.
 *
 * Example:
 * Input: 121
 * Output: Palindrome
 *
 * Approach:
 * - Reverse the number using modulus and division
 * - Compare reversed number with original
 *
 * Time Complexity: O(d) where d = number of digits
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class PalindromeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check result
        if (isPalindrome(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        scanner.close();
    }

    // Method to check palindrome
    public static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }
}