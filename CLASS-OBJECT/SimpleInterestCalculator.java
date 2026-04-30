/**
 * Problem: Simple Interest and Total Amount Calculation
 * 
 * Formula:
 * - Simple Interest (SI) = (Principal × Time × Rate) / 100
 * - Total Amount = Principal + SI
 * 
 * Approach:
 * - Define a 'InterestEngine' class to handle the mathematical logic
 * - Use 'float' for time and rate to accommodate decimal values (e.g., 2.5 years)
 * - Implement Scanner for user-driven input
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class InterestEngine {

    /**
     * Calculates and prints Simple Interest and the Final Amount
     * @param principal The initial amount invested/borrowed
     * @param time The duration in years (or months as decimal)
     * @param rate The annual interest rate
     */
    void calculate(int principal, float time, float rate) {
        // Simple Interest Calculation
        float si = (principal * time * rate) / 100;
        float total = principal + si;

        // Output Formatting
        System.out.println("\n--- Calculation Results ---");
        System.out.println("Interest Accrued : " + si);
        System.out.println("Total Maturity Value : " + total);
    }
}

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input gathering
        System.out.print("Enter Principal Amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter Time (in years/months decimal): ");
        float time = sc.nextFloat();

        System.out.print("Enter Annual Rate of Interest: ");
        float rate = sc.nextFloat();

        // Object initialization
        InterestEngine engine = new InterestEngine();

        // Execution
        engine.calculate(principal, time, rate);

        // Resource closure
        sc.close();
    }
}