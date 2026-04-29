/**
 * Problem: Simple Calculator using Switch Case
 *
 * Task:
 * - Perform basic arithmetic operations on two numbers
 *
 * Operations Supported:
 * + (Addition)
 * - (Subtraction)
 * * (Multiplication)
 * / (Division)
 * % (Modulo)
 *
 * Approach:
 * - Take two numbers and an operator as input
 * - Use switch-case to perform the selected operation
 * - Handle division and modulo by zero separately
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation
        calculate(num1, num2, operator);

        scanner.close();
    }

    // Method to perform calculation
    public static void calculate(double num1, double num2, char operator) {

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }
    }
}