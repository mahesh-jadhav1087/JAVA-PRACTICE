/**
 * Problem: Check Perfect Square using Ternary Operator
 *
 * Task:
 * - Given a number, check whether it is a perfect square
 *
 * Definition:
 * - A number is a perfect square if its square root is an integer
 *
 * Approach:
 * - Take input number
 * - Find square root using Math.sqrt()
 * - Convert it to integer
 * - Check if (sqrt * sqrt == number)
 * - Use ternary operator to print result
 *
 * Edge Case:
 * - Negative numbers are not perfect squares
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class PerfectSquareCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check result
        String result = checkPerfectSquare(num);

        // Output
        System.out.println(result);

        scanner.close();
    }

    // Method to check perfect square
    public static String checkPerfectSquare(int num) {

        if (num < 0) {
            return "Negative numbers are not perfect squares.";
        }

        int sqrt = (int) Math.sqrt(num);

        return (sqrt * sqrt == num) ? "Perfect Square" : "Not Perfect Square";
    }
}