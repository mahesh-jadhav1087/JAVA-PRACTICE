/**
 * Problem: Reverse a Given Integer
 * 
 * Logic:
 * - Extract the last digit using modulo: digit = num % 10
 * - Append digit to reversed number: reverse = reverse * 10 + digit
 * - Remove the last digit using division: num = num / 10
 * 
 * Approach:
 * - Implement a dedicated 'ReversalEngine' class to handle digit manipulation
 * - Use a while loop to process the number until it reaches zero
 * - Utilize Scanner for interactive user input
 * 
 * Time Complexity: O(log10(n)) - where n is the number of digits
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class ReversalEngine {

    /**
     * Reverses the digits of an integer
     * @param num The integer to be reversed
     * @return The reversed integer
     */
    public int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;          // Extract the last digit
            reverse = reverse * 10 + digit; // Shift existing digits left and add new digit
            num = num / 10;                // Truncate the original number
        }
        return reverse;
    }
}

public class NumberReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer to reverse: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            // Object Initialization
            ReversalEngine engine = new ReversalEngine();

            // Execution and Output
            int result = engine.reverse(num);
            System.out.println("Reversed Number: " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Resource Closure
        sc.close();
    }
}