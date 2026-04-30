/**
 * Problem: Calculate Factorial of a Number
 * 
 * Formula:
 * n! = n × (n-1) × (n-2) × ... × 1
 * (Note: 0! = 1)
 * 
 * Approach:
 * - Utilize an iterative approach with a 'for' loop
 * - Maintain a running product in a 'fact' variable
 * - Encapsulate the logic within a specialized 'FactorialEngine' class
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class FactorialEngine {

    /**
     * Calculates the factorial of a given integer
     * @param num The number to calculate the factorial for
     * @return The calculated factorial result
     */
    public int findFactorial(int num) {
        int fact = 1;

        // Iterative logic to calculate product from 1 to num
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

public class FactorialApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to find its factorial: ");
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            // Handling negative input check
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // Object Initialization
                FactorialEngine engine = new FactorialEngine();

                // Logic Execution and Output
                int result = engine.findFactorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Resource Closure
        sc.close();
    }
}