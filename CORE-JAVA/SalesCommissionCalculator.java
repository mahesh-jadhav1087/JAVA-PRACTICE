/**
 * Problem: Sales Commission Calculator
 *
 * Rules:
 * - Sales < 5000       → 2% commission
 * - 5000 to 10000      → 5% commission
 * - Above 10000        → 10% commission
 *
 * Approach:
 * - Use conditional statements to determine commission rate
 * - Multiply sales with respective percentage
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        // Calculate commission
        double commission = calculateCommission(sales);

        // Output
        System.out.printf("Commission amount: %.2f%n", commission);

        scanner.close();
    }

    // Method to calculate commission
    public static double calculateCommission(double sales) {

        if (sales < 5000) {
            return sales * 0.02;
        } 
        else if (sales <= 10000) {
            return sales * 0.05;
        } 
        else {
            return sales * 0.10;
        }
    }
}