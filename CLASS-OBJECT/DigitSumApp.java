/**
 * Problem: Calculate the Sum of Digits of an Integer
 * 
 * Logic:
 * - Extract the last digit using modulo operator: digit = num % 10
 * - Accumulate the digit into a running sum: sum = sum + digit
 * - Remove the last digit using integer division: num = num / 10
 * 
 * Approach:
 * - Implement a dedicated 'DigitEngine' class for modularity
 * - Use a 'while' loop to process each digit until the number becomes zero
 * - Utilize Scanner to handle user input dynamically
 * 
 * Time Complexity: O(log10(n)) - where n is the value of the number
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class DigitEngine {

    /**
     * Calculates the sum of all digits in a given integer
     * @param num The integer to be processed
     * @return The total sum of its digits
     */
    public int calculateSum(int num) {
        int sum = 0;
        
        // Handle negative numbers by converting to absolute value
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit;         // Add digit to sum
            num /= 10;            // Remove the last digit
        }
        return sum;
    }
}

public class DigitSumApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Interface
        System.out.print("Enter an integer: ");
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            // Object Initialization
            DigitEngine engine = new DigitEngine();

            // Execution
            int totalSum = engine.calculateSum(num);

            // Output
            System.out.println("The sum of digits for " + num + " is: " + totalSum);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Resource Management
        sc.close();
    }
}