/**
 * Problem: Simple Interest Calculator
 *
 * Task:
 * - Calculate simple interest based on principal, rate, and time
 *
 * Formula:
 * - Simple Interest (SI) = (P × R × T) / 100
 *
 * Input:
 * - Principal amount (P)
 * - Rate of interest (R)
 * - Time in years (T)
 *
 * Output:
 * - Simple Interest value
 *
 * Approach:
 * - Take input values
 * - Apply the formula
 * - Display the result
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate
        double simpleInterest = calculateSI(principal, rate, time);

        // Output
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }

    // Method to calculate simple interest
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}