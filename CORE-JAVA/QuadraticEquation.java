/**
 * Problem: Quadratic Equation Solver
 *
 * Task:
 * - Find the roots of a quadratic equation of the form:
 *   ax^2 + bx + c = 0
 *
 * Formula:
 * - Discriminant (D) = b^2 - 4ac
 * - Roots:
 *   root1 = (-b + sqrt(D)) / (2a)
 *   root2 = (-b - sqrt(D)) / (2a)
 *
 * Cases:
 * - If D > 0 → Two distinct real roots
 * - If D == 0 → One real root (repeated)
 * - If D < 0 → Complex roots
 *
 * Approach:
 * - Take input values a, b, c
 * - Calculate discriminant
 * - Use conditional logic to determine type of roots
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter values of a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Check if valid quadratic equation
        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        solveQuadratic(a, b, c);

        scanner.close();
    }

    // Method to solve quadratic equation
    public static void solveQuadratic(double a, double b, double c) {

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Two distinct real roots:");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);

        } else if (discriminant == 0) {

            double root = -b / (2 * a);

            System.out.println("One real root:");
            System.out.println("Root = " + root);

        } else {

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Complex roots:");
            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}