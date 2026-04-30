/**
 * Problem: Basic Arithmetic Calculator
 * 
 * Operations:
 * - Addition (num1 + num2)
 * - Subtraction (num1 - num2)
 * - Multiplication (num1 * num2)
 * - Division (num1 / num2) with zero-check logic
 * 
 * Approach:
 * - Utilize a dedicated Calculator class for arithmetic logic
 * - Use Scanner to capture user input for two numbers
 * - Cast integers to float to ensure precision in results
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class CalculationEngine {

    // Method to calculate Addition
    public float add(int num1, int num2) {
        return (float) num1 + num2;
    }

    // Method to calculate Subtraction
    public float sub(int num1, int num2) {
        return (float) num1 - num2;
    }

    // Method to calculate Multiplication
    public float mul(int num1, int num2) {
        return (float) num1 * num2;
    }

    // Method to calculate Division with safety check
    public float div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }
        return (float) num1 / num2;
    }
}

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        CalculationEngine engine = new CalculationEngine();

        // Calculations & Output
        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition       : " + engine.add(num1, num2));
        System.out.println("Subtraction    : " + engine.sub(num1, num2));
        System.out.println("Multiplication : " + engine.mul(num1, num2));
        System.out.println("Division       : " + engine.div(num1, num2));

        scanner.close();
    }
}