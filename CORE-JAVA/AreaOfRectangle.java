/**
 * Problem: Area of a Rectangle
 *
 * Formula:
 * Area = length × breadth
 *
 * Approach:
 * - Take length and breadth as input
 * - Multiply both to get area
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(length, breadth);

        // Output
        System.out.println("Area of rectangle: " + area);

        scanner.close();
    }

    // Method to calculate area
    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}