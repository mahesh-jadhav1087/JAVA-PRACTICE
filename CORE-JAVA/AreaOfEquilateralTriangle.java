/**
 * Problem: Area of an Equilateral Triangle
 *
 * Formula:
 * Area = (√3 / 4) × side²
 *
 * Approach:
 * - Take side length as input
 * - Apply formula using Math.sqrt(3)
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

 class AreaOfEquilateralTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(side);

        // Output
        System.out.println("Area of the equilateral triangle is: " + area);

        scanner.close();
    }

    // Method to calculate area
    public static double calculateArea(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }
}